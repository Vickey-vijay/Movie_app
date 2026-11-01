package dm;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: I.java */
/* JADX INFO: loaded from: classes11.dex */
public class a {
    public static void a(int i10, String str, String str2) {
        Logger logger = Logger.getLogger(str);
        if (i10 != 4) {
            logger.log(Level.WARNING, str2);
        } else {
            logger.log(Level.INFO, str2);
        }
    }
}
