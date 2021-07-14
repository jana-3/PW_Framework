package PWDemo.PageClass;

import com.microsoft.playwright.Page;

import java.nio.file.Paths;

public class SamplePage {


    private Page page;

    public SamplePage(Page page){
        this.page = page;
    }


    public  void launchURL(){
        page.navigate("http://codoid.com/");
    }


    public  void clickAboutUs(){
        page.click("xpath=//li/a[text()='About Us']");
    }

    public void clickInnovations(){
        page.click("text=Innovations");
    }



    public  void verifyInnovationsPage(){
        page.waitForSelector(".et_pb_row.et_pb_row_0.et_pb_gutters1");
        page.isVisible(".et_pb_row.et_pb_row_0.et_pb_gutters1");
    }

    public void screenShot(){

        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("screenshots1/" +  ".png"))) ;
    }
}
