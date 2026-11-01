package kj;

import java.io.CharConversionException;
import java.io.IOException;
import java.io.OutputStream;
import java.text.MessageFormat;
import java.util.ResourceBundle;

/* JADX INFO: compiled from: ServletOutputStream.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class n extends OutputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ResourceBundle f62826b = ResourceBundle.getBundle("javax.servlet.LocalStrings");

    public void b(String str) throws IOException {
        if (str == null) {
            str = "null";
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if ((65280 & cCharAt) != 0) {
                throw new CharConversionException(MessageFormat.format(f62826b.getString("err.not_iso8859_1"), Character.valueOf(cCharAt)));
            }
            write(cCharAt);
        }
    }
}
