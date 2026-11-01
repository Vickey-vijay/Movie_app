package ue;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.zxing.DecodeHintType;
import java.util.Hashtable;
import java.util.Vector;
import y5.i;

/* JADX INFO: compiled from: DecodeImgThread.java */
/* JADX INFO: loaded from: classes11.dex */
public class e extends Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f72843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f72844c;

    public static int a(BitmapFactory.Options options, int i10, int i11) {
        int i12 = options.outHeight;
        int i13 = options.outWidth;
        int i14 = 1;
        while (true) {
            i13 >>= 1;
            if (i13 < i10 || (i12 = i12 >> 1) < i11) {
                break;
            }
            i14 <<= 1;
        }
        return i14;
    }

    public static Bitmap c(String str, int i10, int i11) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inSampleSize = a(options, i10, i11);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(str, options);
    }

    public e(String str, d dVar) {
        this.f72843b = str;
        this.f72844c = dVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        super.run();
        if (!TextUtils.isEmpty(this.f72843b) && this.f72844c != null) {
            Bitmap bitmapC = c(this.f72843b, 400, 400);
            y5.e eVar = new y5.e();
            Hashtable hashtable = new Hashtable(2);
            Vector vector = new Vector();
            vector.addAll(b.f72833d);
            vector.addAll(b.f72834e);
            vector.addAll(b.f72835f);
            hashtable.put(DecodeHintType.POSSIBLE_FORMATS, vector);
            eVar.d(hashtable);
            i iVarC = null;
            try {
                iVarC = eVar.c(new y5.b(new c6.i(new a(bitmapC))));
                Log.i("解析结果", iVarC.f());
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            if (iVarC != null) {
                this.f72844c.b(iVarC);
            } else {
                this.f72844c.a();
            }
        }
    }
}
