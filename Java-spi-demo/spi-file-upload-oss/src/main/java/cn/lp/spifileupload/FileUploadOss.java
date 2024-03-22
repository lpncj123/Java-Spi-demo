package cn.lp.spifileupload;


/**
 * @BelongsProject: spilearn
 * @BelongsPackage: cn.lp.oss.serviceImpl
 * @Author: lp
 * @CreateTime: 2024-03-21  18:20
 * @Description: TODO
 * @Version: 1.0
 */
public class FileUploadOss implements IFileUpload {
    @Override
    public void upload(String fileName) {
        System.out.println(fileName+"oss upload");
    }
}
