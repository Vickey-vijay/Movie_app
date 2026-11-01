package qb;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import ck.p;
import kotlin.Metadata;

/* JADX INFO: compiled from: SVGABitmapByteArrayDecoder.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lqb/b;", "Lqb/c;", "", "data", "Landroid/graphics/BitmapFactory$Options;", "ops", "Landroid/graphics/Bitmap;", "c", "<init>", "()V", "com.opensource.svgaplayer"}, k = 1, mv = {1, 4, 0})
public final class b extends c<byte[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f66562a = new b();

    @Override // qb.c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Bitmap b(byte[] data, BitmapFactory.Options ops) {
        p.k(data, "data");
        p.k(ops, "ops");
        return BitmapFactory.decodeByteArray(data, 0, data.length, ops);
    }
}
