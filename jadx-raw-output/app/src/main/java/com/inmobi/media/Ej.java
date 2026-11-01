package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.safedk.android.internal.partials.InMobiFilesBridge;
import java.io.File;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public final class Ej implements M0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f22601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22602b;

    @Override // com.inmobi.media.M0
    public final Object a() {
        byte[] bArr = this.f22601a;
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        ck.p.g(bitmapDecodeByteArray);
        return a(bitmapDecodeByteArray);
    }

    public Ej(String str, byte[] bArr) {
        ck.p.j(bArr, "imageBytes");
        ck.p.j(str, "location");
        this.f22601a = bArr;
        this.f22602b = str;
    }

    public final String a(Bitmap bitmap) {
        String string = UUID.randomUUID().toString();
        ck.p.i(string, "toString(...)");
        String str = string + ".jpg";
        File file = new File(this.f22602b);
        if (!file.exists()) {
            file.mkdirs();
        }
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, InMobiFilesBridge.fileOutputStreamCtor(new File(this.f22602b + "/" + str)));
        return this.f22602b + "/" + str;
    }
}
