package yads;

import android.content.Context;
import android.graphics.Typeface;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class hw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f78401a;

    public final Typeface a(sw0 sw0Var) {
        try {
            File fileB = b(sw0Var);
            if (fileB.exists()) {
                return Typeface.createFromFile(fileB);
            }
            return null;
        } catch (Exception unused) {
            boolean z10 = ad1.f75480a;
            return null;
        }
    }

    public final File b(sw0 sw0Var) {
        return new File(new File(this.f78401a.getFilesDir(), "downloaded_fonts"), g43.a(sw0Var.name() + ".ttf"));
    }

    public hw0(Context context) {
        this.f78401a = context;
    }
}
