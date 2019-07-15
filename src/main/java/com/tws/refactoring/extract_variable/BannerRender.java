package com.tws.refactoring.extract_variable;

public class BannerRender {
    String renderBanner(String platform, String browser) {
        int isPlatformMAC = platform.toUpperCase().indexOf("MAC");
        int isBrowserIE = browser.toUpperCase().indexOf("IE");
        return ((isPlatformMAC > -1) && (isBrowserIE > -1)) ? "IE on Mac?" : "banner";
    }
}
