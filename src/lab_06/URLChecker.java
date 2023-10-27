package lab_06;

import java.util.Scanner;

public class URLChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a URL: ");
        String url = scanner.nextLine();

        checkURL(url);

        scanner.close();
    }
    public static void checkURL(String url) {
        String protocol = getProtocol(url);
        if (protocol != null) {
            System.out.println("Protocol: " + protocol);

            String domain = getDomain(url);
            if (domain != null) {
                System.out.println("Domain: " + domain);

                String extension = getExtension(url);
                if (extension != null) {
                    System.out.println("Domain Extension: " + extension);
                } else {
                    System.out.println("Invalid Domain Extension");
                }

            } else {
                System.out.println("Invalid Domain");
            }

        } else {
            System.out.println("Invalid URL");
        }
    }

    public static String getProtocol(String url) {
        if (url.startsWith("http://")) {
            return "http";
        } else if (url.startsWith("https://")) {
            return "https";
        } else {
            return null;
        }
    }

    public static String getDomain(String url) {
        int startIndex = url.indexOf("://") + 3;
        int endIndex = url.lastIndexOf(".");
        if (startIndex >= 3 && endIndex > startIndex) {
            return url.substring(startIndex, endIndex);
        } else {
            return null;
        }
    }

    public static String getExtension(String url) {
        int startIndex = url.lastIndexOf(".") + 1;
        if (startIndex > 0 && startIndex < url.length()) {
            return url.substring(startIndex);
        } else {
            return null;
        }
    }

}
