package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.Layout;
import android.transition.AutoTransition;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.view.ViewCompat;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class XP {
    public static byte[] A00;
    public static String[] A01 = {"aXQ8cQ350VCAT2mitcvykUGHubvGx6C9", "NAK0YApfoevBcA8nU2", "YHwKc8bJ3fYIczYaga21kucMEh7K8adi", "qYAOAoZ496ND8", "6pHjubFxbGGqNA8P9d", "3r9qhhsI1oDbETggKvxV5tdwn", "sRn13xQSljRP603ULBb8dNJbjS", "vNgqutu69Vtz3tnibxv52jRaXo"};
    public static final int A02;
    public static final int A03;
    public static final ConcurrentHashMap<Integer, Integer> A04;
    public static final AtomicInteger A05;

    public static String A0B(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 15);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0C() {
        A00 = new byte[]{120, 118, -127, -127, 122, -121, 105, -114, -123, 122, -35, -26, -29, -35, -27, ExifInterface.MARKER_EOI, -19, -23, -17, -20, -35, -33, -124, -121, -118, -110, -125, -112, -125, -126, 125, -127, -118, -121, -127, -119, 125, -126, -125, -118, 127, -105, 125, -117, -111, -40, -35, -29, -44, ExifInterface.MARKER_APP1, -30, -29, -40, -29, -40, -48, -37, ExifInterface.MARKER_EOI, -29, -49, -45, -47, -45, -49, -42, ExifInterface.MARKER_EOI, -36, -28, -43, -30, -49, -45, -36, ExifInterface.MARKER_EOI, -45, -37, -29, -49, -33, -34, -49, -45, -28, -47, -125, -115, 121, 125, -116, 127, 123, -114, -125, -112, 127, 121, 123, -115, 121, 125, -114, 123, 121, -112, 76, -90, -103, -85, -107, -90, -104, -103, -104, -109, -86, -99, -104, -103, -93, -50, -53, -66, -53, -48, -53, -119, -55, -63, -64, -59, -47, -55, -11, -29, -16, -11, -81, -11, -25, -12, -21, -24, -81, -17, -25, -26, -21, -9, -17, -36, -43, -48, -40, -36, -52, -80, -53, -66, -68, -82, -69, -84, -75, -78, -84, -76};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static boolean A0e(C1977dL c1977dL, ME me2, Map<String, String> map) {
        String str = map.get(A0B(84, 21, 11));
        boolean z10 = str != null && str.equals(Boolean.TRUE.toString());
        if (z10 && (A0d(c1977dL, me2) || A0b(me2, map))) {
            return true;
        }
        String str2 = map.get(A0B(57, 27, 97));
        return z10 && (str2 != null && str2.equals(Boolean.TRUE.toString())) && A0c(me2, map);
    }

    static {
        A0C();
        A03 = OP.A02(-1, 0);
        A02 = OP.A02(ViewCompat.MEASURED_STATE_MASK, 115);
        A05 = new AtomicInteger(1);
        A04 = new ConcurrentHashMap<>();
    }

    public static int A00() {
        int i10;
        int newValue;
        do {
            i10 = A05.get();
            newValue = i10 + 1;
            if (newValue > 16777215) {
                newValue = 1;
            }
        } while (!A05.compareAndSet(i10, newValue));
        return i10;
    }

    public static int A01(int i10) {
        return (int) TypedValue.applyDimension(2, i10, AbstractC1680Wl.A04);
    }

    public static int A02(int i10) {
        if (A0a(i10)) {
            return OP.A05(i10, -1, 0.4f);
        }
        return OP.A05(i10, ViewCompat.MEASURED_STATE_MASK, 0.2f);
    }

    public static int A03(TextView textView) {
        Layout layout;
        int lineCount;
        if (textView == null || textView.getLayout() == null || (lineCount = (layout = textView.getLayout()).getLineCount()) <= 0) {
            return 0;
        }
        double ellipsisCount = layout.getEllipsisCount(lineCount - 1);
        double ellipsisCount2 = ellipsisCount / (((double) textView.getText().length()) - ellipsisCount);
        if (A01[3].length() == 20) {
            throw new RuntimeException();
        }
        A01[3] = "IkK7ljd8WWfE470H6O9Fo";
        return (int) Math.ceil(ellipsisCount2);
    }

    public static int A04(TextView textView, int i10) {
        int lineHeightTitle = A03(textView);
        int lines = 0;
        int extraLinesRequired = textView.getLineHeight();
        while (i10 > extraLinesRequired && lines < lineHeightTitle) {
            lines++;
            i10 -= extraLinesRequired;
        }
        return lines;
    }

    public static Drawable A05(int i10, int i11) {
        return A08(i10, A02(i10), i11);
    }

    public static Drawable A06(int i10, int i11) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i10);
        gradientDrawable.setCornerRadius(i11);
        return gradientDrawable;
    }

    public static Drawable A07(int i10, int i11) {
        float[] fArr = new float[8];
        Arrays.fill(fArr, i11);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setColor(i10);
        return shapeDrawable;
    }

    public static Drawable A08(int i10, int i11, int i12) {
        return A09(i10, i11, i10, i12);
    }

    public static Drawable A09(int i10, int i11, int i12, int i13) {
        return new RippleDrawable(ColorStateList.valueOf(i11), A06(i10, i13), A07(i12, i13));
    }

    public static TextView A0A(ViewGroup viewGroup) {
        for (int i10 = 0; i10 < i; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (A01[3].length() == 20) {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[0] = "6RJtTYzLBnUcHRvsTatmkmWKIun16hlE";
                strArr[2] = "BwINbhkVgYMYeGJED3O8k6L5SNrYNN6g";
                return textView;
            }
            if (childAt instanceof ViewGroup) {
                A0A((ViewGroup) childAt);
            }
        }
        return null;
    }

    public static void A0D(int i10, View view) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.8f, 1.0f, 0.8f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(i10 / 3);
        scaleAnimation.setInterpolator(new AccelerateInterpolator());
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setDuration((i10 / 3) * 2);
        scaleAnimation2.setInterpolator(new BounceInterpolator());
        scaleAnimation.setAnimationListener(new C1484Os(view, scaleAnimation2));
        view.startAnimation(scaleAnimation);
    }

    public static void A0E(int i10, View view) {
        Integer viewId = A04.get(Integer.valueOf(i10));
        if (viewId != null) {
            view.setId(viewId.intValue());
        } else {
            A0I(view);
        }
    }

    public static void A0F(View view) {
        A0L(view, 8);
    }

    public static void A0G(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            A0R((ViewGroup) parent);
        }
    }

    public static void A0H(View view) {
        if (view == null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (A01[3].length() == 20) {
            throw new RuntimeException();
        }
        A01[3] = "DU33ZJN3ug5gIBKNKyYbqVVAVCFz";
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
    }

    public static void A0I(View view) {
        if (view == null) {
            return;
        }
        view.setId(View.generateViewId());
    }

    public static void A0J(View view) {
        A0L(view, 0);
    }

    public static void A0K(View view, int i10) {
        view.setBackground(new ColorDrawable(i10));
    }

    public static void A0L(View view, int i10) {
        if (view != null) {
            view.setVisibility(i10);
        }
    }

    public static void A0M(View view, int i10, int i11) {
        A0Q(view, A08(i10, A02(i10), i11));
    }

    public static void A0N(View view, int i10, int i11, int i12) {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{A03, A02});
        gradientDrawable.setCornerRadius(i10);
        gradientDrawable.setStroke(i11, i12);
        A0Q(view, gradientDrawable);
    }

    public static void A0O(View view, int i10, int i11, int i12) {
        A0Q(view, A09(i10, A02(i10), i11, i12));
    }

    public static void A0P(View view, Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{A03, A02});
        gradientDrawable.setCornerRadius(0.0f);
        A0Q(view, gradientDrawable);
    }

    public static void A0Q(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static void A0R(ViewGroup viewGroup) {
        A0S(viewGroup, 200);
    }

    public static void A0S(ViewGroup viewGroup, int i10) {
        A0U(viewGroup, new AutoTransition(), i10);
    }

    public static void A0T(ViewGroup viewGroup, Transition transition) {
        A0U(viewGroup, transition, 200);
    }

    public static void A0U(ViewGroup viewGroup, Transition transition, int i10) {
        transition.setDuration(i10);
        transition.setInterpolator(new AccelerateDecelerateInterpolator());
        TransitionManager.beginDelayedTransition(viewGroup, transition);
    }

    public static void A0V(Button button) {
        Typeface typeface = Typeface.create(A0B(119, 13, 77), 0);
        button.setTypeface(typeface);
    }

    public static void A0W(TextView textView, boolean z10, int i10) {
        Typeface typeface;
        if (z10) {
            typeface = Typeface.create(A0B(Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 17, 115), 0);
        } else {
            Typeface typeface2 = Typeface.SANS_SERIF;
            typeface = Typeface.create(typeface2, 0);
        }
        textView.setTypeface(typeface);
        if (A01[5].length() != 25) {
            throw new RuntimeException();
        }
        A01[3] = "EYVeEO4Fu";
        textView.setTextSize(2, i10);
    }

    public static void A0X(Toast toast, String str, int i10, int i11, int i12) {
        if (toast == null) {
            return;
        }
        toast.setGravity(i10, i11, i12);
        TextView textViewA0A = A0A((ViewGroup) toast.getView());
        if (textViewA0A != null) {
            textViewA0A.setText(str);
            textViewA0A.setGravity(17);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x006b  */
    /* JADX WARN: Code duplicated, block: B:12:0x0075  */
    /* JADX WARN: Code duplicated, block: B:6:0x000e  */
    public static void A0Y(Map<String, String> map, AbstractC2252hy abstractC2252hy) {
        byte b10;
        String strA0B;
        if (abstractC2252hy == null) {
            return;
        }
        String strA0v = abstractC2252hy.A0v();
        switch (strA0v.hashCode()) {
            case -1364000502:
                if (strA0v.equals(A0B(105, 14, 37))) {
                    b10 = 1;
                } else {
                    b10 = -1;
                }
                strA0B = A0B(0, 10, 6);
                switch (b10) {
                    case 0:
                        map.put(strA0B, AdPlacementType.INTERSTITIAL.name());
                        break;
                    case 1:
                        map.put(strA0B, AdPlacementType.REWARDED_VIDEO.name());
                        break;
                }
                map.put(A0B(149, 8, 88), abstractC2252hy.A0q());
                map.put(A0B(84, 21, 11), String.valueOf(abstractC2252hy.A1W()));
                map.put(A0B(57, 27, 97), String.valueOf(abstractC2252hy.A1R()));
                map.put(A0B(22, 23, 15), String.valueOf(abstractC2252hy.A0n()));
                return;
            case 604727084:
                String strA0B2 = A0B(45, 12, 96);
                if (A01[3].length() == 20) {
                    throw new RuntimeException();
                }
                A01[3] = "p9FB";
                if (strA0v.equals(strA0B2)) {
                    b10 = 0;
                } else {
                    b10 = -1;
                }
                strA0B = A0B(0, 10, 6);
                switch (b10) {
                    case 0:
                        map.put(strA0B, AdPlacementType.INTERSTITIAL.name());
                        break;
                    case 1:
                        map.put(strA0B, AdPlacementType.REWARDED_VIDEO.name());
                        break;
                }
                map.put(A0B(149, 8, 88), abstractC2252hy.A0q());
                map.put(A0B(84, 21, 11), String.valueOf(abstractC2252hy.A1W()));
                map.put(A0B(57, 27, 97), String.valueOf(abstractC2252hy.A1R()));
                map.put(A0B(22, 23, 15), String.valueOf(abstractC2252hy.A0n()));
                return;
            default:
                b10 = -1;
                strA0B = A0B(0, 10, 6);
                switch (b10) {
                    case 0:
                        map.put(strA0B, AdPlacementType.INTERSTITIAL.name());
                        break;
                    case 1:
                        map.put(strA0B, AdPlacementType.REWARDED_VIDEO.name());
                        break;
                }
                map.put(A0B(149, 8, 88), abstractC2252hy.A0q());
                map.put(A0B(84, 21, 11), String.valueOf(abstractC2252hy.A1W()));
                map.put(A0B(57, 27, 97), String.valueOf(abstractC2252hy.A1R()));
                map.put(A0B(22, 23, 15), String.valueOf(abstractC2252hy.A0n()));
                return;
        }
    }

    public static void A0Z(View... viewArr) {
        for (View view : viewArr) {
            A0H(view);
        }
    }

    public static boolean A0a(int i10) {
        return OP.A00(i10) < 0.5d;
    }

    public static boolean A0b(ME me2, Map<String, String> extraData) {
        boolean nonIabDestination = !A0B(157, 9, 58).equals(extraData.get(A0B(10, 12, 107)));
        boolean nonCtaClick = me2 != ME.A08;
        return nonIabDestination && nonCtaClick;
    }

    public static boolean A0c(ME me2, Map<String, String> extraData) {
        boolean zEquals = A0B(157, 9, 58).equals(extraData.get(A0B(10, 12, 107)));
        boolean ctaClick = me2 != ME.A08;
        return zEquals && ctaClick;
    }

    public static boolean A0d(C1977dL c1977dL, ME me2) {
        return me2 == ME.A08 && U7.A2o(c1977dL);
    }
}
