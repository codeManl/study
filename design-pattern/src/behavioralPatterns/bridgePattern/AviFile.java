package behavioralPatterns.bridgePattern;

public class AviFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println(fileName + "格式为avi，解码完成");
    }
}
