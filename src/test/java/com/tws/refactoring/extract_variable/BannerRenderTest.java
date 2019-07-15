package com.tws.refactoring.extract_variable;

import org.junit.Assert;
import org.junit.Test;
public class BannerRenderTest {
    BannerRender bannerRender = new BannerRender();
    @Test
    public void should_return_IE_on_Mac_when_call_renderBanner_given_platform_is_mac_and_browser_is_IE() {
        String result = "IE on Mac?";
        String actualResult = bannerRender.renderBanner("MAC", "IE");
        Assert.assertSame(result,actualResult);
    }

    @Test
    public void should_return_banner_when_call_renderBanner_given_platform_not_is_mac_and_browser_is_IE() {
        String result = "banner";
        String actualResult = bannerRender.renderBanner("Windows", "IE");
        Assert.assertSame(result,actualResult);
    }

    @Test
    public void should_return_banner_when_call_renderBanner_given_platform_is_mac_and_browser_not_is_IE() {
        String result = "banner";
        String actualResult = bannerRender.renderBanner("MAC", "Chrome");
        Assert.assertSame(result,actualResult);
    }

    @Test
    public void should_return_banner_when_call_renderBanner_given_platform_not_is_mac_and_browser_not_is_IE() {
        String result = "banner";
        String actualResult = bannerRender.renderBanner("Windows", "Chrome");
        Assert.assertSame(result,actualResult);
    }

}