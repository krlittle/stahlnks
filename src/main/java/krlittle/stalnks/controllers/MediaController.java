package krlittle.stalnks.controllers;

import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class MediaController {

    private String image;

    private MediaController(String image, String sound) {
        this.image = image;
    }

    @GetMapping(value = "/image", produces = MediaType.IMAGE_JPEG_VALUE)
    public void getImage(HttpServletResponse response) throws IOException {

        response.setContentType(MediaType.IMAGE_JPEG_VALUE);

        ClassPathResource imageFile = new ClassPathResource(image);

        StreamUtils.copy(imageFile.getInputStream(), response.getOutputStream());
    }
}