package gl;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes2.dex */
public abstract class x1 {
    public static void a(String str, String str2, String str3) {
        String str4 = str2 + File.separator + str3;
        try {
            File file = new File(str2);
            if (!file.exists()) {
                file.mkdirs();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(str4);
            fileOutputStream.write(str.getBytes(StandardCharsets.UTF_8));
            fileOutputStream.close();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
