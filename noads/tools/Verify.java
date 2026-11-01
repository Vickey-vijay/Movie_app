import com.android.apksig.ApkVerifier;
import java.io.File;

/** Verify an APK's signatures the way the platform would (min SDK 24). Usage: Verify <apk> */
public class Verify {
    public static void main(String[] a) throws Exception {
        ApkVerifier.Result r = new ApkVerifier.Builder(new File(a[0])).setMinCheckedPlatformVersion(24).build().verify();
        System.out.println("verified=" + r.isVerified() + " v1=" + r.isVerifiedUsingV1Scheme() + " v2=" + r.isVerifiedUsingV2Scheme());
        for (ApkVerifier.IssueWithParams e : r.getErrors()) System.out.println("ERROR: " + e);
        for (ApkVerifier.IssueWithParams e : r.getWarnings()) System.out.println("warn: " + e);
        if (!r.isVerified()) System.exit(1);
    }
}
