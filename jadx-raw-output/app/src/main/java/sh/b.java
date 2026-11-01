package sh;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.core.Logger;
import io.bidmachine.nativead.utils.NoSSLv3SocketFactory;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: compiled from: ConnectionUtils.java */
/* JADX INFO: loaded from: classes7.dex */
public class b {
    public static InputStream getInputStream(@NonNull String str, int i10) throws Exception {
        try {
            URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
            uRLConnectionOpenConnection.setConnectTimeout(i10);
            uRLConnectionOpenConnection.setReadTimeout(i10);
            setupNoSSLv3(uRLConnectionOpenConnection);
            uRLConnectionOpenConnection.connect();
            return uRLConnectionOpenConnection.getInputStream();
        } catch (Exception unused) {
            Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
            builderBuildUpon.scheme("http");
            URLConnection uRLConnectionOpenConnection2 = new URL(builderBuildUpon.build().toString()).openConnection();
            uRLConnectionOpenConnection2.setConnectTimeout(i10);
            uRLConnectionOpenConnection2.setReadTimeout(i10);
            uRLConnectionOpenConnection2.connect();
            return uRLConnectionOpenConnection2.getInputStream();
        }
    }

    private static void setupNoSSLv3(@Nullable URLConnection uRLConnection) {
        try {
            if (uRLConnection instanceof HttpsURLConnection) {
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnection;
                httpsURLConnection.setSSLSocketFactory(new NoSSLv3SocketFactory(httpsURLConnection.getSSLSocketFactory()));
            }
        } catch (Exception e10) {
            Logger.w(e10);
        }
    }
}
