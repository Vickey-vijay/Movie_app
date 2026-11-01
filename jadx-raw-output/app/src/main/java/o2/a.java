package o2;

import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import ck.p;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.HttpMethod;
import com.facebook.internal.j0;
import com.ironsource.C3426d4;
import java.io.File;
import java.io.FileNotFoundException;
import kotlin.Metadata;

/* JADX INFO: compiled from: ShareInternalUtility.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J$\u0010\f\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u000f"}, d2 = {"Lo2/a;", "", "Lcom/facebook/AccessToken;", "accessToken", "Ljava/io/File;", C3426d4.i.f28530b, "Lcom/facebook/GraphRequest$b;", "callback", "Lcom/facebook/GraphRequest;", "b", "Landroid/net/Uri;", "imageUri", "a", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f64946a = new a();

    public static final GraphRequest a(AccessToken accessToken, Uri imageUri, GraphRequest.b callback) throws FileNotFoundException {
        p.j(imageUri, "imageUri");
        String path = imageUri.getPath();
        if (j0.V(imageUri) && path != null) {
            return b(accessToken, new File(path), callback);
        }
        if (!j0.S(imageUri)) {
            throw new FacebookException("The image Uri must be either a file:// or content:// Uri");
        }
        GraphRequest.ParcelableResourceWithMimeType parcelableResourceWithMimeType = new GraphRequest.ParcelableResourceWithMimeType(imageUri, "image/png");
        Bundle bundle = new Bundle(1);
        bundle.putParcelable(C3426d4.i.f28530b, parcelableResourceWithMimeType);
        return new GraphRequest(accessToken, "me/staging_resources", bundle, HttpMethod.POST, callback, null, 32, null);
    }

    public static final GraphRequest b(AccessToken accessToken, File file, GraphRequest.b callback) throws FileNotFoundException {
        GraphRequest.ParcelableResourceWithMimeType parcelableResourceWithMimeType = new GraphRequest.ParcelableResourceWithMimeType(ParcelFileDescriptor.open(file, 268435456), "image/png");
        Bundle bundle = new Bundle(1);
        bundle.putParcelable(C3426d4.i.f28530b, parcelableResourceWithMimeType);
        return new GraphRequest(accessToken, "me/staging_resources", bundle, HttpMethod.POST, callback, null, 32, null);
    }
}
