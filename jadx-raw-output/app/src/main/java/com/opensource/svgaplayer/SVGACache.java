package com.opensource.svgaplayer;

import android.content.Context;
import ck.p;
import ck.w;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.tools.SameMD5;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.io.File;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: compiled from: SVGACache.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001eB\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0018\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\u000b\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fJ\u000e\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u0016\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\fR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/opensource/svgaplayer/SVGACache;", "", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Lmj/r;", "i", "Lcom/opensource/svgaplayer/SVGACache$Type;", "type", "j", "", "h", "g", "", "cacheKey", InneractiveMediationDefs.GENDER_FEMALE, "str", "c", "Ljava/net/URL;", "url", "d", "Ljava/io/File;", "b", "e", "audio", "a", "Lcom/opensource/svgaplayer/SVGACache$Type;", "Ljava/lang/String;", "cacheDir", "<init>", "()V", "Type", "com.opensource.svgaplayer"}, k = 1, mv = {1, 4, 0})
public final class SVGACache {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SVGACache f43009c = new SVGACache();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static Type type = Type.DEFAULT;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static String cacheDir = "/";

    /* JADX INFO: compiled from: SVGACache.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/opensource/svgaplayer/SVGACache$Type;", "", "(Ljava/lang/String;I)V", "DEFAULT", "FILE", "com.opensource.svgaplayer"}, k = 1, mv = {1, 1, 15})
    public enum Type {
        DEFAULT,
        FILE
    }

    public final File a(String audio) {
        p.k(audio, "audio");
        return new File(cacheDir + audio + ".mp3");
    }

    public final File b(String cacheKey) {
        p.k(cacheKey, "cacheKey");
        return new File(cacheDir + cacheKey + '/');
    }

    public final String c(String str) throws NoSuchAlgorithmException {
        p.k(str, "str");
        MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
        Charset charsetForName = Charset.forName("UTF-8");
        p.f(charsetForName, "Charset.forName(charsetName)");
        byte[] bytes = str.getBytes(charsetForName);
        p.f(bytes, "(this as java.lang.String).getBytes(charset)");
        messageDigest.update(bytes);
        String string = "";
        for (byte b10 : messageDigest.digest()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            w wVar = w.f6066a;
            String str2 = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
            p.f(str2, "java.lang.String.format(format, *args)");
            sb2.append(str2);
            string = sb2.toString();
        }
        return string;
    }

    public final File e(String cacheKey) {
        p.k(cacheKey, "cacheKey");
        return new File(cacheDir + cacheKey + ".svga");
    }

    public final boolean f(String cacheKey) {
        p.k(cacheKey, "cacheKey");
        return (g() ? b(cacheKey) : e(cacheKey)).exists();
    }

    public final boolean g() {
        return type == Type.DEFAULT;
    }

    public final boolean h() {
        return !p.e("/", cacheDir);
    }

    public final void i(Context context) {
        j(context, Type.DEFAULT);
    }

    public final String d(URL url) {
        p.k(url, "url");
        String string = url.toString();
        p.f(string, "url.toString()");
        return c(string);
    }

    public final void j(Context context, Type type2) {
        p.k(type2, "type");
        if (!h() && context != null) {
            StringBuilder sb2 = new StringBuilder();
            File cacheDir2 = context.getCacheDir();
            p.f(cacheDir2, "context.cacheDir");
            sb2.append(cacheDir2.getAbsolutePath());
            sb2.append("/svga/");
            cacheDir = sb2.toString();
            File file = new File(cacheDir);
            if (!(!file.exists())) {
                file = null;
            }
            if (file != null) {
                file.mkdir();
            }
            type = type2;
        }
    }
}
