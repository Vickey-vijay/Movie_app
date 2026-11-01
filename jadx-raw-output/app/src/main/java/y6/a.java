package y6;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import com.green.hand.library.R$array;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: EmojiManager.java */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f75297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static List<Integer> f75298b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static List<Integer> f75299c = new ArrayList();

    public static int b(int i10) throws Resources.NotFoundException {
        for (int i11 = 0; i11 < f75298b.size(); i11++) {
            if (f75298b.get(i11).intValue() == i10) {
                return f75299c.get(i11).intValue();
            }
        }
        throw new Resources.NotFoundException("Unsupported emoji code <" + i10 + ">, which is not in Emoji list.");
    }

    /* JADX INFO: renamed from: y6.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: EmojiManager.java */
    public static class C0801a extends ImageSpan {
        public C0801a(Drawable drawable) {
            super(drawable);
        }

        @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
        public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
            Drawable drawable = getDrawable();
            int i15 = (((i14 - i12) - getDrawable().getBounds().bottom) / 2) + i12;
            canvas.save();
            canvas.translate(f10, i15);
            drawable.draw(canvas);
            canvas.restore();
        }
    }

    public static int a(int i10) {
        return f75298b.get(i10).intValue();
    }

    public static List<Integer> c(int i10, int i11) {
        return new ArrayList(f75299c.subList(i10, i11));
    }

    public static int d() {
        return f75298b.size();
    }

    public static CharSequence f(String str, float f10) {
        boolean z10;
        int codePoint;
        if (str == null) {
            return "";
        }
        char[] charArray = str.toCharArray();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        for (int i10 = 0; i10 < charArray.length; i10++) {
            if (!Character.isHighSurrogate(charArray[i10])) {
                if (!Character.isLowSurrogate(charArray[i10])) {
                    z10 = false;
                    codePoint = charArray[i10];
                } else if (i10 > 0) {
                    int i11 = i10 - 1;
                    if (Character.isSurrogatePair(charArray[i11], charArray[i10])) {
                        z10 = true;
                        codePoint = Character.toCodePoint(charArray[i11], charArray[i10]);
                    }
                }
                if (f75298b.contains(Integer.valueOf(codePoint))) {
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(f75297a.getResources(), BitmapFactory.decodeResource(f75297a.getResources(), b(codePoint)));
                    int i12 = (int) f10;
                    bitmapDrawable.setBounds(0, 0, i12, i12);
                    spannableStringBuilder.setSpan(new C0801a(bitmapDrawable), z10 ? i10 - 1 : i10, i10 + 1, 33);
                }
            }
        }
        return spannableStringBuilder;
    }

    public static void e(Context context) {
        Context applicationContext = context.getApplicationContext();
        f75297a = applicationContext;
        Resources resources = applicationContext.getResources();
        int[] intArray = resources.getIntArray(R$array.emoji_code_list);
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(R$array.emoji_res_list);
        if (intArray.length == typedArrayObtainTypedArray.length()) {
            for (int i10 = 0; i10 < intArray.length; i10++) {
                f75298b.add(Integer.valueOf(intArray[i10]));
                f75299c.add(Integer.valueOf(typedArrayObtainTypedArray.getResourceId(i10, -1)));
            }
            typedArrayObtainTypedArray.recycle();
            return;
        }
        typedArrayObtainTypedArray.recycle();
        throw new IndexOutOfBoundsException("Code and resource are not match in Emoji xml.");
    }
}
