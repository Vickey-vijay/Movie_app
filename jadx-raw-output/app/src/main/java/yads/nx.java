package yads;

import android.graphics.Color;
import android.text.TextUtils;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import com.ironsource.C3426d4;
import com.ironsource.Z7;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes10.dex */
public abstract class nx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f80849a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f80850b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f80851c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap f80852d;

    static {
        HashMap map = new HashMap();
        f80852d = map;
        wi1.a(-984833, map, "aliceblue", -332841, "antiquewhite");
        wi1.a(-16711681, map, "aqua", -8388652, "aquamarine");
        wi1.a(-983041, map, "azure", -657956, "beige");
        wi1.a(-6972, map, "bisque", ViewCompat.MEASURED_STATE_MASK, "black");
        wi1.a(-5171, map, "blanchedalmond", -16776961, "blue");
        wi1.a(-7722014, map, "blueviolet", -5952982, "brown");
        wi1.a(-2180985, map, "burlywood", -10510688, "cadetblue");
        wi1.a(-8388864, map, "chartreuse", -2987746, "chocolate");
        wi1.a(-32944, map, "coral", -10185235, "cornflowerblue");
        wi1.a(-1828, map, "cornsilk", -2354116, "crimson");
        wi1.a(-16711681, map, "cyan", -16777077, "darkblue");
        wi1.a(-16741493, map, "darkcyan", -4684277, "darkgoldenrod");
        wi1.a(-5658199, map, "darkgray", -16751616, "darkgreen");
        wi1.a(-5658199, map, "darkgrey", -4343957, "darkkhaki");
        wi1.a(-7667573, map, "darkmagenta", -11179217, "darkolivegreen");
        wi1.a(-29696, map, "darkorange", -6737204, "darkorchid");
        wi1.a(-7667712, map, "darkred", -1468806, "darksalmon");
        wi1.a(-7357297, map, "darkseagreen", -12042869, "darkslateblue");
        wi1.a(-13676721, map, "darkslategray", -13676721, "darkslategrey");
        wi1.a(-16724271, map, "darkturquoise", -7077677, "darkviolet");
        wi1.a(-60269, map, "deeppink", -16728065, "deepskyblue");
        wi1.a(-9868951, map, "dimgray", -9868951, "dimgrey");
        wi1.a(-14774017, map, "dodgerblue", -5103070, "firebrick");
        wi1.a(-1296, map, "floralwhite", -14513374, "forestgreen");
        wi1.a(-65281, map, "fuchsia", -2302756, "gainsboro");
        wi1.a(-460545, map, "ghostwhite", -10496, "gold");
        wi1.a(-2448096, map, "goldenrod", -8355712, "gray");
        wi1.a(-16744448, map, "green", -5374161, "greenyellow");
        wi1.a(-8355712, map, "grey", -983056, "honeydew");
        wi1.a(-38476, map, "hotpink", -3318692, "indianred");
        wi1.a(-11861886, map, "indigo", -16, "ivory");
        wi1.a(-989556, map, "khaki", -1644806, "lavender");
        wi1.a(-3851, map, "lavenderblush", -8586240, "lawngreen");
        wi1.a(-1331, map, "lemonchiffon", -5383962, "lightblue");
        wi1.a(-1015680, map, "lightcoral", -2031617, "lightcyan");
        wi1.a(-329006, map, "lightgoldenrodyellow", -2894893, "lightgray");
        wi1.a(-7278960, map, "lightgreen", -2894893, "lightgrey");
        wi1.a(-18751, map, "lightpink", -24454, "lightsalmon");
        wi1.a(-14634326, map, "lightseagreen", -7876870, "lightskyblue");
        wi1.a(-8943463, map, "lightslategray", -8943463, "lightslategrey");
        wi1.a(-5192482, map, "lightsteelblue", -32, "lightyellow");
        wi1.a(-16711936, map, "lime", -13447886, "limegreen");
        wi1.a(-331546, map, "linen", -65281, "magenta");
        wi1.a(-8388608, map, "maroon", -10039894, "mediumaquamarine");
        wi1.a(-16777011, map, "mediumblue", -4565549, "mediumorchid");
        wi1.a(-7114533, map, "mediumpurple", -12799119, "mediumseagreen");
        wi1.a(-8689426, map, "mediumslateblue", -16713062, "mediumspringgreen");
        wi1.a(-12004916, map, "mediumturquoise", -3730043, "mediumvioletred");
        wi1.a(-15132304, map, "midnightblue", -655366, "mintcream");
        wi1.a(-6943, map, "mistyrose", -6987, "moccasin");
        wi1.a(-8531, map, "navajowhite", -16777088, "navy");
        wi1.a(-133658, map, "oldlace", -8355840, "olive");
        wi1.a(-9728477, map, "olivedrab", -23296, "orange");
        wi1.a(-47872, map, "orangered", -2461482, "orchid");
        wi1.a(-1120086, map, "palegoldenrod", -6751336, "palegreen");
        wi1.a(-5247250, map, "paleturquoise", -2396013, "palevioletred");
        wi1.a(-4139, map, "papayawhip", -9543, "peachpuff");
        wi1.a(-3308225, map, "peru", -16181, "pink");
        wi1.a(-2252579, map, "plum", -5185306, "powderblue");
        wi1.a(-8388480, map, "purple", -10079335, "rebeccapurple");
        wi1.a(SupportMenu.CATEGORY_MASK, map, "red", -4419697, "rosybrown");
        wi1.a(-12490271, map, "royalblue", -7650029, "saddlebrown");
        wi1.a(-360334, map, "salmon", -744352, "sandybrown");
        wi1.a(-13726889, map, "seagreen", -2578, "seashell");
        wi1.a(-6270419, map, "sienna", -4144960, "silver");
        wi1.a(-7876885, map, "skyblue", -9807155, "slateblue");
        wi1.a(-9404272, map, "slategray", -9404272, "slategrey");
        wi1.a(-1286, map, "snow", -16711809, "springgreen");
        wi1.a(-12156236, map, "steelblue", -2968436, "tan");
        wi1.a(-16744320, map, "teal", -2572328, "thistle");
        wi1.a(-40121, map, "tomato", 0, C3426d4.i.T);
        wi1.a(-12525360, map, "turquoise", -1146130, "violet");
        wi1.a(-663885, map, "wheat", -1, "white");
        wi1.a(-657931, map, "whitesmoke", InputDeviceCompat.SOURCE_ANY, "yellow");
        map.put("yellowgreen", -6632142);
    }

    public static int a(String str, boolean z10) {
        Pattern pattern;
        int i10;
        if (!TextUtils.isEmpty(str)) {
            String strReplace = str.replace(Z7.f27998r, "");
            if (strReplace.charAt(0) == '#') {
                int i11 = (int) Long.parseLong(strReplace.substring(1), 16);
                if (strReplace.length() == 7) {
                    return (-16777216) | i11;
                }
                if (strReplace.length() == 9) {
                    return ((i11 & 255) << 24) | (i11 >>> 8);
                }
                throw new IllegalArgumentException();
            }
            if (strReplace.startsWith("rgba")) {
                if (z10) {
                    pattern = f80851c;
                } else {
                    pattern = f80850b;
                }
                Matcher matcher = pattern.matcher(strReplace);
                if (matcher.matches()) {
                    if (z10) {
                        String strGroup = matcher.group(4);
                        strGroup.getClass();
                        i10 = (int) (Float.parseFloat(strGroup) * 255.0f);
                    } else {
                        String strGroup2 = matcher.group(4);
                        strGroup2.getClass();
                        i10 = Integer.parseInt(strGroup2, 10);
                    }
                    String strGroup3 = matcher.group(1);
                    strGroup3.getClass();
                    int i12 = Integer.parseInt(strGroup3, 10);
                    String strGroup4 = matcher.group(2);
                    strGroup4.getClass();
                    int i13 = Integer.parseInt(strGroup4, 10);
                    String strGroup5 = matcher.group(3);
                    strGroup5.getClass();
                    return Color.argb(i10, i12, i13, Integer.parseInt(strGroup5, 10));
                }
            } else if (strReplace.startsWith("rgb")) {
                Matcher matcher2 = f80849a.matcher(strReplace);
                if (matcher2.matches()) {
                    String strGroup6 = matcher2.group(1);
                    strGroup6.getClass();
                    int i14 = Integer.parseInt(strGroup6, 10);
                    String strGroup7 = matcher2.group(2);
                    strGroup7.getClass();
                    int i15 = Integer.parseInt(strGroup7, 10);
                    String strGroup8 = matcher2.group(3);
                    strGroup8.getClass();
                    return Color.rgb(i14, i15, Integer.parseInt(strGroup8, 10));
                }
            } else {
                Integer num = (Integer) f80852d.get(ki.a(strReplace));
                if (num != null) {
                    return num.intValue();
                }
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }
}
