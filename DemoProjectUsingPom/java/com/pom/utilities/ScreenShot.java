package com.pom.utilities;


import java.awt.image.BufferedImage;



import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

import javax.imageio.ImageIO;

import com.pom.base.TestBase;

//import com.pom.base.TestBase;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class ScreenShot extends TestBase{

	public void captureFullPageScreenshot(String fileName) throws IOException {
	

			AShot ashot = new AShot();
			BufferedImage img = ashot.shootingStrategy(ShootingStrategies.viewportPasting(2000)).takeScreenshot(getDriver())
					.getImage();

			String baseDir = System.getProperty("user.dir");
			ImageIO.write(img, "png",
					new File(baseDir + "/src/test/resources/FailedTestCases/" + fileName + "failed.png"));

			// we save screen shot in src/test/resources=> create Folder by FailedTestScreenShot
			//it will take screen shot after TC is failed,using @Listeners
		}

	}

		