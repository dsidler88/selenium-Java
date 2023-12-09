package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import java.nio.file.Paths;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload(){
        var uploadPage = homePage.clickFileUpload();
        var currentWorkingDir = Paths.get(".").toAbsolutePath().normalize().toString();
        uploadPage.uploadFile(currentWorkingDir + "/resources/test.jpeg");
        assertEquals(uploadPage.getUploadedFiles(), "test.jpeg", "Uploaded files incorrect");
    }
}
