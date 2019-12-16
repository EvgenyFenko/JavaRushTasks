package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes imageTypes) {
//        System.out.println(imageTypes.toString());
        if (!(imageTypes instanceof ImageTypes)) {
            throw new  IllegalArgumentException("Неизвестный тип картинки");
        } else if (imageTypes.toString().equals("JPG")) {
            return new JpgReader();
        } else if (imageTypes.toString().equals("BMP")) {
            return new BmpReader();
        } else if (imageTypes.toString().equals("PNG")) {
            return new PngReader();
        } else throw new  IllegalArgumentException("Неизвестный тип картинки");
    }
}
