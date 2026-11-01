package y9;

import androidx.exifinterface.media.ExifInterface;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.Gc;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.UUID;

/* JADX INFO: compiled from: UUIDUtils.java */
/* JADX INFO: loaded from: classes8.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String[] f75332a = {"a", "b", "c", "d", "e", InneractiveMediationDefs.GENDER_FEMALE, "g", "h", "i", "j", CampaignEx.JSON_KEY_AD_K, "l", InneractiveMediationDefs.GENDER_MALE, "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", VastAttributes.HORIZONTAL_POSITION, VastAttributes.VERTICAL_POSITION, "z", "0", "1", "2", ExifInterface.GPS_MEASUREMENT_3D, "4", CampaignEx.CLICKMODE_ON, "6", Gc.f26641e, "8", "9", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C", "D", ExifInterface.LONGITUDE_EAST, "F", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", ExifInterface.LATITUDE_SOUTH, "T", "U", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, ExifInterface.LONGITUDE_WEST, "X", "Y", "Z"};

    public static String a(int i10) {
        StringBuilder sb2 = new StringBuilder(UUID.randomUUID().toString());
        while (sb2.length() < i10) {
            sb2.append(UUID.randomUUID().toString());
        }
        return sb2.substring(0, i10);
    }
}
