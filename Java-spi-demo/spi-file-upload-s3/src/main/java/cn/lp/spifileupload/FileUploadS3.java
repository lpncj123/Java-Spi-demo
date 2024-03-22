package cn.lp.spifileupload;

/**
 * @BelongsProject: spilearn
 * @BelongsPackage: cn.lp.s3
 * @Author: lp
 * @CreateTime: 2024-03-21  18:23
 * @Description: TODO
 * @Version: 1.0
 */
public class FileUploadS3 implements IFileUpload {
    @Override
    public void upload(String fileName) {
        System.out.println(fileName+"s3 upload");
    }
}
