package y0;

import androidx.exifinterface.media.ExifInterface;

/* JADX INFO: compiled from: LogLevel.java */
/* JADX INFO: loaded from: classes11.dex */
public class c {
    public static String a(int i10) {
        if (i10 == 2) {
            return ExifInterface.GPS_MEASUREMENT_INTERRUPTED;
        }
        if (i10 == 3) {
            return "D";
        }
        if (i10 == 4) {
            return "I";
        }
        if (i10 == 5) {
            return ExifInterface.LONGITUDE_WEST;
        }
        if (i10 == 6) {
            return ExifInterface.LONGITUDE_EAST;
        }
        if (i10 < 2) {
            return "V-" + (2 - i10);
        }
        return "E+" + (i10 - 6);
    }
}
