public class Bai3InThongTin {
    public static void main(String[] args) {
        String javaVersion =System.getProperty("java.version");
        String javaRuntime =System.getProperty("java.runtime.version");
        String javaHome = System.getProperty("java.home");
        String javaVendor = System.getProperty("java.vendor");
        String javaVendorUrl = System.getProperty("java.vendor.url");
        String javaClassPath = System.getProperty("java.class.path");

        System.out.println("Java version: "+ javaVersion);

        System.out.println("Java Runtime version: "+ javaRuntime);

        System.out.println("Java Home: "+ javaHome);

        System.out.println("Java Vendor: "+ javaVendor);

        System.out.println("Java Vendor Url: "+javaVendorUrl);

        System.out.println("Java Class Path: "+javaClassPath);
    }
}
