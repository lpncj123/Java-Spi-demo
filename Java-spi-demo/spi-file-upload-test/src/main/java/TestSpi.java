import cn.lp.spifileupload.IFileUpload;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @BelongsProject: spilearn
 * @BelongsPackage: PACKAGE_NAME
 * @Author: lp
 * @CreateTime: 2024-03-21  18:25
 * @Description: TODO
 * @Version: 1.0
 */
public class TestSpi {
    public static void main(String[] args) {
        ServiceLoader<IFileUpload> loader = ServiceLoader.load(IFileUpload.class);
        for(Iterator<IFileUpload> it = loader.iterator(); it.hasNext();){
            IFileUpload file = it.next();
            file.upload("测试文件上传");
        }
    }
}
