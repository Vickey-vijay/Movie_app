package io.bidmachine.media3.ui;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.media3.common.text.Cue;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.Util;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
final class WebViewSubtitleOutput extends FrameLayout implements SubtitleView.a {
    private static final float CSS_LINE_HEIGHT = 1.2f;
    private static final String DEFAULT_BACKGROUND_CSS_CLASS = "default_bg";
    private float bottomPaddingFraction;
    private final CanvasSubtitleOutput canvasSubtitleOutput;
    private float defaultTextSize;
    private int defaultTextSizeType;
    private CaptionStyleCompat style;
    private List<Cue> textCues;
    private final WebView webView;

    public class a extends WebView {
        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent me2) {
            DetectTouchUtils.viewOnTouch("io.bidmachine", this, me2);
            return super.dispatchTouchEvent(me2);
        }

        @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
        protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
            if (1 == 0) {
                setMeasuredDimension(0, 0);
            } else {
                super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            }
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // android.webkit.WebView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            super.onTouchEvent(motionEvent);
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            super.performClick();
            return false;
        }
    }

    public WebViewSubtitleOutput(Context context) {
        this(context, null);
    }

    private static int anchorTypeToTranslatePercent(int i10) {
        if (i10 != 1) {
            return i10 != 2 ? 0 : -100;
        }
        return -50;
    }

    private static String convertVerticalTypeToCss(int i10) {
        if (i10 != 1) {
            return i10 != 2 ? "horizontal-tb" : "vertical-lr";
        }
        return "vertical-rl";
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] $SwitchMap$android$text$Layout$Alignment;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            $SwitchMap$android$text$Layout$Alignment = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$text$Layout$Alignment[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$text$Layout$Alignment[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public WebViewSubtitleOutput(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.textCues = Collections.emptyList();
        this.style = CaptionStyleCompat.DEFAULT;
        this.defaultTextSize = 0.0533f;
        this.defaultTextSizeType = 0;
        this.bottomPaddingFraction = 0.08f;
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context, attributeSet);
        this.canvasSubtitleOutput = canvasSubtitleOutput;
        a aVar = new a(context, attributeSet);
        this.webView = aVar;
        aVar.setBackgroundColor(0);
        addView(canvasSubtitleOutput);
        addView(aVar);
    }

    private static String convertAlignmentToCss(@Nullable Layout.Alignment alignment) {
        if (alignment == null) {
            return "center";
        }
        int i10 = b.$SwitchMap$android$text$Layout$Alignment[alignment.ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? "center" : "end";
        }
        return "start";
    }

    private static String convertCaptionStyleToCssTextShadow(CaptionStyleCompat captionStyleCompat) {
        int i10 = captionStyleCompat.edgeType;
        if (i10 == 1) {
            return Util.formatInvariant("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", c.toCssRgba(captionStyleCompat.edgeColor));
        }
        if (i10 == 2) {
            return Util.formatInvariant("0.1em 0.12em 0.15em %s", c.toCssRgba(captionStyleCompat.edgeColor));
        }
        if (i10 != 3) {
            return i10 != 4 ? "unset" : Util.formatInvariant("-0.05em -0.05em 0.15em %s", c.toCssRgba(captionStyleCompat.edgeColor));
        }
        return Util.formatInvariant("0.06em 0.08em 0.15em %s", c.toCssRgba(captionStyleCompat.edgeColor));
    }

    private static String getBlockShearTransformFunction(Cue cue) {
        float f10 = cue.shearDegrees;
        if (f10 == 0.0f) {
            return "";
        }
        int i10 = cue.verticalType;
        return Util.formatInvariant("%s(%.2fdeg)", (i10 == 2 || i10 == 1) ? "skewY" : "skewX", Float.valueOf(f10));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:26:0x0107  */
    /* JADX WARN: Code duplicated, block: B:29:0x0121  */
    /* JADX WARN: Code duplicated, block: B:30:0x0124  */
    /* JADX WARN: Code duplicated, block: B:33:0x013b  */
    /* JADX WARN: Code duplicated, block: B:35:0x013e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0140  */
    /* JADX WARN: Code duplicated, block: B:38:0x0144 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0147 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0149  */
    /* JADX WARN: Code duplicated, block: B:48:0x015b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0183  */
    /* JADX WARN: Code duplicated, block: B:58:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:62:0x021f  */
    /* JADX WARN: Code duplicated, block: B:63:0x023b  */
    private void updateWebView() {
        String invariant;
        int iAnchorTypeToTranslatePercent;
        int i10;
        float f10;
        String invariant2;
        int i11;
        int i12;
        int i13;
        String str;
        String str2;
        int i14;
        String str3;
        String str4;
        int i15;
        SpannedToHtmlConverter.HtmlAndCss htmlAndCssConvert;
        Iterator it;
        SpannedToHtmlConverter.HtmlAndCss htmlAndCss;
        Layout.Alignment alignment;
        String str5;
        boolean z10;
        WebViewSubtitleOutput webViewSubtitleOutput = this;
        StringBuilder sb2 = new StringBuilder();
        int i16 = 0;
        String strConvertTextSizeToCss = webViewSubtitleOutput.convertTextSizeToCss(webViewSubtitleOutput.defaultTextSizeType, webViewSubtitleOutput.defaultTextSize);
        int i17 = 1;
        float f11 = CSS_LINE_HEIGHT;
        sb2.append(Util.formatInvariant("<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>", c.toCssRgba(webViewSubtitleOutput.style.foregroundColor), strConvertTextSizeToCss, Float.valueOf(CSS_LINE_HEIGHT), convertCaptionStyleToCssTextShadow(webViewSubtitleOutput.style)));
        HashMap map = new HashMap();
        map.put(c.cssAllClassDescendantsSelector(DEFAULT_BACKGROUND_CSS_CLASS), Util.formatInvariant("background-color:%s;", c.toCssRgba(webViewSubtitleOutput.style.backgroundColor)));
        int i18 = 0;
        while (i18 < webViewSubtitleOutput.textCues.size()) {
            Cue cue = webViewSubtitleOutput.textCues.get(i18);
            float f12 = cue.position;
            float f13 = f12 != -3.4028235E38f ? f12 * 100.0f : 50.0f;
            int iAnchorTypeToTranslatePercent2 = anchorTypeToTranslatePercent(cue.positionAnchor);
            float f14 = cue.line;
            if (f14 != -3.4028235E38f) {
                if (cue.lineType != i17) {
                    Object[] objArr = new Object[i17];
                    objArr[i16] = Float.valueOf(f14 * 100.0f);
                    invariant = Util.formatInvariant("%.2f%%", objArr);
                    iAnchorTypeToTranslatePercent = cue.verticalType == i17 ? -anchorTypeToTranslatePercent(cue.lineAnchor) : anchorTypeToTranslatePercent(cue.lineAnchor);
                } else if (f14 >= 0.0f) {
                    Object[] objArr2 = new Object[i17];
                    objArr2[i16] = Float.valueOf(f14 * f11);
                    invariant = Util.formatInvariant("%.2fem", objArr2);
                    iAnchorTypeToTranslatePercent = i16;
                    i10 = iAnchorTypeToTranslatePercent;
                } else {
                    Object[] objArr3 = new Object[i17];
                    objArr3[i16] = Float.valueOf(((-f14) - 1.0f) * f11);
                    invariant = Util.formatInvariant("%.2fem", objArr3);
                    iAnchorTypeToTranslatePercent = i16;
                    i10 = i17;
                }
                f10 = cue.size;
                if (f10 != -3.4028235E38f) {
                    Object[] objArr4 = new Object[i17];
                    objArr4[0] = Float.valueOf(f10 * 100.0f);
                    invariant2 = Util.formatInvariant("%.2f%%", objArr4);
                } else {
                    invariant2 = "fit-content";
                }
                String strConvertAlignmentToCss = convertAlignmentToCss(cue.textAlignment);
                String strConvertVerticalTypeToCss = convertVerticalTypeToCss(cue.verticalType);
                String strConvertTextSizeToCss2 = webViewSubtitleOutput.convertTextSizeToCss(cue.textSizeType, cue.textSize);
                if (cue.windowColorSet) {
                    i11 = cue.windowColor;
                } else {
                    i11 = webViewSubtitleOutput.style.windowColor;
                }
                String cssRgba = c.toCssRgba(i11);
                i12 = iAnchorTypeToTranslatePercent;
                i13 = cue.verticalType;
                str = "right";
                str2 = "left";
                if (i13 != 1) {
                    if (i10 != 0) {
                        str = "left";
                    }
                    str2 = "top";
                    i14 = 2;
                    str3 = str;
                } else if (i13 != 2) {
                    str3 = i10 != 0 ? "bottom" : "top";
                    i14 = 2;
                } else {
                    if (i10 == 0) {
                        str = "left";
                    }
                    str2 = "top";
                    i14 = 2;
                    str3 = str;
                }
                if (i13 != i14 || i13 == 1) {
                    str4 = "height";
                    i15 = i12;
                    i12 = iAnchorTypeToTranslatePercent2;
                } else {
                    str4 = "width";
                    i15 = iAnchorTypeToTranslatePercent2;
                }
                htmlAndCssConvert = SpannedToHtmlConverter.convert(cue.text, getContext().getResources().getDisplayMetrics().density);
                it = map.keySet().iterator();
                while (it.hasNext()) {
                    Iterator it2 = it;
                    String str6 = (String) it.next();
                    SpannedToHtmlConverter.HtmlAndCss htmlAndCss2 = htmlAndCssConvert;
                    str5 = (String) map.put(str6, (String) map.get(str6));
                    if (str5 != null || str5.equals(map.get(str6))) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    Assertions.checkState(z10);
                    it = it2;
                    htmlAndCssConvert = htmlAndCss2;
                }
                htmlAndCss = htmlAndCssConvert;
                sb2.append(Util.formatInvariant("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", Integer.valueOf(i18), str2, Float.valueOf(f13), str3, invariant, str4, invariant2, strConvertAlignmentToCss, strConvertVerticalTypeToCss, strConvertTextSizeToCss2, cssRgba, Integer.valueOf(i15), Integer.valueOf(i12), getBlockShearTransformFunction(cue)));
                sb2.append(Util.formatInvariant("<span class='%s'>", DEFAULT_BACKGROUND_CSS_CLASS));
                alignment = cue.multiRowAlignment;
                if (alignment != null) {
                    sb2.append(Util.formatInvariant("<span style='display:inline-block; text-align:%s;'>", convertAlignmentToCss(alignment)));
                    sb2.append(htmlAndCss.html);
                    sb2.append("</span>");
                } else {
                    sb2.append(htmlAndCss.html);
                }
                sb2.append("</span>");
                sb2.append("</div>");
                i18++;
                f11 = CSS_LINE_HEIGHT;
                i16 = 0;
                webViewSubtitleOutput = this;
                i17 = 1;
            } else {
                Object[] objArr5 = new Object[i17];
                objArr5[i16] = Float.valueOf((1.0f - webViewSubtitleOutput.bottomPaddingFraction) * 100.0f);
                invariant = Util.formatInvariant("%.2f%%", objArr5);
                iAnchorTypeToTranslatePercent = -100;
            }
            i10 = i16;
            f10 = cue.size;
            if (f10 != -3.4028235E38f) {
                Object[] objArr6 = new Object[i17];
                objArr6[0] = Float.valueOf(f10 * 100.0f);
                invariant2 = Util.formatInvariant("%.2f%%", objArr6);
            } else {
                invariant2 = "fit-content";
            }
            String strConvertAlignmentToCss2 = convertAlignmentToCss(cue.textAlignment);
            String strConvertVerticalTypeToCss2 = convertVerticalTypeToCss(cue.verticalType);
            String strConvertTextSizeToCss3 = webViewSubtitleOutput.convertTextSizeToCss(cue.textSizeType, cue.textSize);
            if (cue.windowColorSet) {
                i11 = cue.windowColor;
            } else {
                i11 = webViewSubtitleOutput.style.windowColor;
            }
            String cssRgba2 = c.toCssRgba(i11);
            i12 = iAnchorTypeToTranslatePercent;
            i13 = cue.verticalType;
            str = "right";
            str2 = "left";
            if (i13 != 1) {
                if (i10 != 0) {
                    str = "left";
                }
                str2 = "top";
                i14 = 2;
                str3 = str;
            } else if (i13 != 2) {
                if (i10 != 0) {
                }
                i14 = 2;
            } else {
                if (i10 == 0) {
                    str = "left";
                }
                str2 = "top";
                i14 = 2;
                str3 = str;
            }
            if (i13 != i14) {
                str4 = "height";
                i15 = i12;
                i12 = iAnchorTypeToTranslatePercent2;
            } else {
                str4 = "height";
                i15 = i12;
                i12 = iAnchorTypeToTranslatePercent2;
            }
            htmlAndCssConvert = SpannedToHtmlConverter.convert(cue.text, getContext().getResources().getDisplayMetrics().density);
            it = map.keySet().iterator();
            while (it.hasNext()) {
                Iterator it3 = it;
                String str7 = (String) it.next();
                SpannedToHtmlConverter.HtmlAndCss htmlAndCss3 = htmlAndCssConvert;
                str5 = (String) map.put(str7, (String) map.get(str7));
                if (str5 != null) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                Assertions.checkState(z10);
                it = it3;
                htmlAndCssConvert = htmlAndCss3;
            }
            htmlAndCss = htmlAndCssConvert;
            sb2.append(Util.formatInvariant("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", Integer.valueOf(i18), str2, Float.valueOf(f13), str3, invariant, str4, invariant2, strConvertAlignmentToCss2, strConvertVerticalTypeToCss2, strConvertTextSizeToCss3, cssRgba2, Integer.valueOf(i15), Integer.valueOf(i12), getBlockShearTransformFunction(cue)));
            sb2.append(Util.formatInvariant("<span class='%s'>", DEFAULT_BACKGROUND_CSS_CLASS));
            alignment = cue.multiRowAlignment;
            if (alignment != null) {
                sb2.append(Util.formatInvariant("<span style='display:inline-block; text-align:%s;'>", convertAlignmentToCss(alignment)));
                sb2.append(htmlAndCss.html);
                sb2.append("</span>");
            } else {
                sb2.append(htmlAndCss.html);
            }
            sb2.append("</span>");
            sb2.append("</div>");
            i18++;
            f11 = CSS_LINE_HEIGHT;
            i16 = 0;
            webViewSubtitleOutput = this;
            i17 = 1;
        }
        sb2.append("</div></body></html>");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("<html><head><style>");
        for (String str8 : map.keySet()) {
            sb3.append(str8);
            sb3.append(com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44171d);
            sb3.append((String) map.get(str8));
            sb3.append(com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44172e);
        }
        sb3.append("</style></head>");
        sb2.insert(0, sb3.toString());
        this.webView.loadData(Base64.encodeToString(sb2.toString().getBytes(m5.c.f64119c), 1), "text/html", "base64");
    }

    public void destroy() {
        this.webView.destroy();
    }

    @Override // io.bidmachine.media3.ui.SubtitleView.a
    public void update(List<Cue> list, CaptionStyleCompat captionStyleCompat, float f10, int i10, float f11) {
        this.style = captionStyleCompat;
        this.defaultTextSize = f10;
        this.defaultTextSizeType = i10;
        this.bottomPaddingFraction = f11;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            Cue cue = list.get(i11);
            if (cue.bitmap != null) {
                arrayList.add(cue);
            } else {
                arrayList2.add(cue);
            }
        }
        if (!this.textCues.isEmpty() || !arrayList2.isEmpty()) {
            this.textCues = arrayList2;
            updateWebView();
        }
        this.canvasSubtitleOutput.update(arrayList, captionStyleCompat, f10, i10, f11);
        invalidate();
    }

    private String convertTextSizeToCss(int i10, float f10) {
        float fResolveTextSize = o0.resolveTextSize(i10, f10, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (fResolveTextSize == -3.4028235E38f) {
            return "unset";
        }
        return Util.formatInvariant("%.2fpx", Float.valueOf(fResolveTextSize / getContext().getResources().getDisplayMetrics().density));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10 && !this.textCues.isEmpty()) {
            updateWebView();
        }
    }
}
