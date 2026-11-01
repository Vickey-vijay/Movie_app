package com.bytedance.sdk.openadsdk.utils;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RotateDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.Pair;
import androidx.core.view.GravityCompat;
import androidx.exifinterface.media.ExifInterface;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class cf {
    private static final Map<String, Pair<? extends Drawable, Integer>> ouw = new HashMap();
    private static Integer vt = null;

    private static void ouw() {
        Map<String, Pair<? extends Drawable, Integer>> map = ouw;
        if (map.size() < vt.intValue()) {
            return;
        }
        String key = null;
        int iIntValue = Integer.MAX_VALUE;
        for (Map.Entry<String, Pair<? extends Drawable, Integer>> entry : map.entrySet()) {
            if (((Integer) entry.getValue().second).intValue() < iIntValue) {
                key = entry.getKey();
                iIntValue = ((Integer) entry.getValue().second).intValue();
                if (iIntValue == 1) {
                    break;
                }
            }
        }
        ouw.remove(key);
    }

    private static GradientDrawable ouw(int i10, Integer num, int[] iArr, int[] iArr2, Integer num2, Integer num3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(i10);
        if (num != null) {
            gradientDrawable.setColor(num.intValue());
        }
        int length = iArr != null ? iArr.length : 0;
        if (length == 1) {
            gradientDrawable.setCornerRadius(iArr[0]);
        } else if (length == 4) {
            int i11 = iArr[0];
            int i12 = iArr[1];
            int i13 = iArr[2];
            int i14 = iArr[3];
            gradientDrawable.setCornerRadii(new float[]{i11, i11, i12, i12, i13, i13, i14, i14});
        }
        if (iArr2 != null && iArr2.length == 2) {
            gradientDrawable.setSize(iArr2[0], iArr2[1]);
        }
        if (num2 != null && num3 != null) {
            gradientDrawable.setStroke(num2.intValue(), num3.intValue());
        }
        return gradientDrawable;
    }

    private static StateListDrawable ouw(Drawable drawable, Drawable drawable2) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        if (drawable != null) {
            stateListDrawable.addState(new int[]{R.attr.state_pressed}, drawable);
        }
        if (drawable2 != null) {
            stateListDrawable.addState(new int[0], drawable2);
        }
        return stateListDrawable;
    }

    public static Drawable ouw(Context context, int i10) {
        return ouw(context, Color.parseColor("#1A73E8"), i10);
    }

    public static Drawable ouw(Context context, int i10, int i11) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i10);
        gradientDrawable.setCornerRadius(osn.ouw(context, i11));
        return gradientDrawable;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Drawable ouw(Context context, String str) {
        byte b10;
        Drawable drawableOuw;
        Pair<? extends Drawable, Integer> pair;
        vt = Integer.valueOf(com.bytedance.sdk.openadsdk.core.zih.yu().pno.ouw("perf_con_drawable_code", 0));
        com.bytedance.sdk.component.utils.ko.ouw("DrawableUtils", "get drawable by code, ", "drawable name is: ".concat(String.valueOf(str)));
        Map<String, Pair<? extends Drawable, Integer>> map = ouw;
        com.bytedance.sdk.component.utils.ko.ouw("DrawableUtils", "drawableMap size is：", Integer.valueOf(map.size()), "and drawable content is: ", map);
        if (map.containsKey(str) && (pair = map.get(str)) != null) {
            Drawable drawable = (Drawable) pair.first;
            map.put(str, new Pair<>(drawable, Integer.valueOf(((Integer) pair.second).intValue() + 1)));
            return drawable;
        }
        ouw();
        str.hashCode();
        switch (str.hashCode()) {
            case -2137782317:
                b10 = !str.equals("tt_leftbackicon_selector_for_dark") ? (byte) -1 : (byte) 0;
                break;
            case -2023672829:
                b10 = !str.equals("tt_dislike_dialog_bg") ? (byte) -1 : (byte) 1;
                break;
            case -2010340681:
                b10 = !str.equals("tt_leftbackbutton_titlebar_photo_preview") ? (byte) -1 : (byte) 2;
                break;
            case -1888785259:
                b10 = !str.equals("tt_seek_progress") ? (byte) -1 : (byte) 3;
                break;
            case -1883903877:
                b10 = !str.equals("tt_dislike_middle_seletor") ? (byte) -1 : (byte) 4;
                break;
            case -1881901373:
                b10 = !str.equals("tt_ad_cover_btn_begin_bg") ? (byte) -1 : (byte) 5;
                break;
            case -1818605128:
                b10 = !str.equals("tt_leftbackicon_selector") ? (byte) -1 : (byte) 6;
                break;
            case -1724866088:
                b10 = !str.equals("tt_seek_thumb_normal") ? (byte) -1 : (byte) 7;
                break;
            case -1698792361:
                b10 = !str.equals("tt_stop_movebar_textpage") ? (byte) -1 : (byte) 8;
                break;
            case -1500492368:
                b10 = !str.equals("tt_backup_btn_1") ? (byte) -1 : (byte) 9;
                break;
            case -1308443384:
                b10 = !str.equals("tt_ad_report_info_bg") ? (byte) -1 : (byte) 10;
                break;
            case -1222892514:
                b10 = !str.equals("tt_playable_btn_bk") ? (byte) -1 : (byte) 11;
                break;
            case -1163545839:
                b10 = !str.equals("tt_dislike_bottom_seletor") ? (byte) -1 : (byte) 12;
                break;
            case -1150582740:
                b10 = !str.equals("tt_seek_thumb_fullscreen") ? (byte) -1 : (byte) 13;
                break;
            case -1147412691:
                b10 = !str.equals("tt_custom_dialog_bg") ? (byte) -1 : (byte) 14;
                break;
            case -1107858393:
                b10 = !str.equals("tt_ad_loading_three_mid") ? (byte) -1 : (byte) 15;
                break;
            case -876774215:
                b10 = !str.equals("tt_close_move_detail") ? (byte) -1 : (byte) 16;
                break;
            case -875200849:
                b10 = !str.equals("tt_mute_btn_bg") ? (byte) -1 : (byte) 17;
                break;
            case -847552402:
                b10 = !str.equals("tt_seek_thumb") ? (byte) -1 : (byte) 18;
                break;
            case -561153052:
                b10 = !str.equals("tt_reward_countdown_bg") ? (byte) -1 : (byte) 19;
                break;
            case -508263579:
                b10 = !str.equals("tt_play_movebar_textpage") ? (byte) -1 : (byte) 20;
                break;
            case -473198695:
                b10 = !str.equals("tt_refreshing_video_textpage") ? (byte) -1 : (byte) 21;
                break;
            case -404284879:
                b10 = !str.equals("tt_playable_progress_style") ? (byte) -1 : (byte) 22;
                break;
            case -292612462:
                b10 = !str.equals("tt_seek_thumb_fullscreen_selector") ? (byte) -1 : (byte) 23;
                break;
            case -226695937:
                b10 = !str.equals("tt_ad_landing_loading_three_mid") ? (byte) -1 : (byte) 24;
                break;
            case -154809169:
                b10 = !str.equals("tt_pangle_ad_mute_btn_bg") ? (byte) -1 : (byte) 25;
                break;
            case -97103333:
                b10 = !str.equals("tt_video_black_desc_gradient") ? (byte) -1 : (byte) 26;
                break;
            case 16094728:
                b10 = !str.equals("tt_ad_loading_three_left") ? (byte) -1 : (byte) 27;
                break;
            case 27541452:
                b10 = !str.equals("tt_mute_wrapper") ? (byte) -1 : (byte) 28;
                break;
            case 57270120:
                b10 = !str.equals("tt_dislike_top_bg") ? (byte) -1 : (byte) 29;
                break;
            case 106179457:
                b10 = !str.equals("tt_comment_tv") ? (byte) -1 : (byte) 30;
                break;
            case 242455215:
                b10 = !str.equals("tt_reward_full_new_bar_bg") ? (byte) -1 : (byte) 31;
                break;
            case 247520514:
                b10 = !str.equals("tt_reward_full_video_backup_btn_bg") ? (byte) -1 : (byte) 32;
                break;
            case 310787585:
                b10 = !str.equals("tt_full_reward_loading_progress_style") ? (byte) -1 : (byte) 33;
                break;
            case 314734139:
                b10 = !str.equals("tt_detail_video_btn_bg") ? (byte) -1 : (byte) 34;
                break;
            case 410262782:
                b10 = !str.equals("tt_pangle_banner_btn_bg") ? (byte) -1 : (byte) 35;
                break;
            case 484030064:
                b10 = !str.equals("tt_seek_thumb_fullscreen_press") ? (byte) -1 : (byte) 36;
                break;
            case 494589792:
                b10 = !str.equals("tt_browser_download_selector") ? (byte) -1 : (byte) 37;
                break;
            case 504597563:
                b10 = !str.equals("tt_ad_loading_three_right") ? (byte) -1 : (byte) 38;
                break;
            case 507305701:
                b10 = !str.equals("tt_pangle_btn_bg") ? (byte) -1 : (byte) 39;
                break;
            case 708409173:
                b10 = !str.equals("tt_privacy_progress_style") ? (byte) -1 : (byte) 40;
                break;
            case 991946046:
                b10 = !str.equals("tt_privacy_btn_bg") ? (byte) -1 : (byte) 41;
                break;
            case 1054661938:
                b10 = !str.equals("tt_seek_thumb_press") ? (byte) -1 : ExifInterface.START_CODE;
                break;
            case 1094767909:
                b10 = !str.equals("tt_unmute_wrapper") ? (byte) -1 : (byte) 43;
                break;
            case 1115144587:
                b10 = !str.equals("tt_titlebar_close_seletor_for_dark") ? (byte) -1 : (byte) 44;
                break;
            case 1193160467:
                b10 = !str.equals("tt_ad_landing_loading_three_right") ? (byte) -1 : (byte) 45;
                break;
            case 1234814491:
                b10 = !str.equals("tt_landingpage_loading_text_rect") ? (byte) -1 : (byte) 46;
                break;
            case 1241312517:
                b10 = !str.equals("tt_shadow_btn_back_withoutnight") ? (byte) -1 : (byte) 47;
                break;
            case 1360033453:
                b10 = !str.equals("tt_circle_solid_mian") ? (byte) -1 : (byte) 48;
                break;
            case 1391934389:
                b10 = !str.equals("tt_browser_progress_style") ? (byte) -1 : (byte) 49;
                break;
            case 1459143575:
                b10 = !str.equals("tt_download_corner_bg") ? (byte) -1 : (byte) 50;
                break;
            case 1473061455:
                b10 = !str.equals("tt_ad_report_info_button_bg") ? (byte) -1 : (byte) 51;
                break;
            case 1562327088:
                b10 = !str.equals("tt_ad_landing_loading_three_left") ? (byte) -1 : (byte) 52;
                break;
            case 1635801742:
                b10 = !str.equals("tt_pangle_ad_close_btn_bg") ? (byte) -1 : (byte) 53;
                break;
            case 1733712735:
                b10 = !str.equals("tt_lefterbackicon_titlebar_press_wrapper") ? (byte) -1 : (byte) 54;
                break;
            case 1859118378:
                b10 = !str.equals("tt_reward_video_download_btn_bg") ? (byte) -1 : (byte) 55;
                break;
            case 1908435428:
                b10 = !str.equals("tt_ad_loading_rect") ? (byte) -1 : (byte) 56;
                break;
            case 1967077738:
                b10 = !str.equals("tt_shadow_btn_back") ? (byte) -1 : (byte) 57;
                break;
            case 1986221289:
                b10 = !str.equals("tt_dislike_top_seletor") ? (byte) -1 : (byte) 58;
                break;
            case 1987199879:
                b10 = !str.equals("tt_video_loading_progress_bar") ? (byte) -1 : (byte) 59;
                break;
            case 1995246663:
                b10 = !str.equals("tt_ad_skip_btn_bg2") ? (byte) -1 : (byte) 60;
                break;
            case 2051103617:
                b10 = !str.equals("tt_privacy_webview_bg") ? (byte) -1 : (byte) 61;
                break;
            case 2091139328:
                b10 = !str.equals("tt_titlebar_close_seletor") ? (byte) -1 : (byte) 62;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                drawableOuw = ouw(com.bytedance.sdk.component.utils.vpp.lh(context, "tt_lefterbackicon_titlebar_press_for_dark"), com.bytedance.sdk.component.utils.vpp.lh(context, "tt_lefterbackicon_titlebar_for_dark"));
                break;
            case 1:
                drawableOuw = ouw(0, -1, new int[]{osn.ouw(context, 8.0f)}, null, null, null);
                break;
            case 2:
                drawableOuw = ouw(com.bytedance.sdk.component.utils.vpp.lh(context, "tt_white_lefterbackicon_titlebar_press"), com.bytedance.sdk.component.utils.vpp.lh(context, "tt_white_lefterbackicon_titlebar"));
                break;
            case 3:
                drawableOuw = new LayerDrawable(new Drawable[]{ouw(0, Integer.valueOf(Color.parseColor("#A5FFFFFF")), new int[]{osn.ouw(context, 1.5f)}, new int[]{-1, osn.ouw(context, 1.0f)}, null, null), new ClipDrawable(ouw(0, -1, new int[]{osn.ouw(context, 1.5f)}, new int[]{-1, osn.ouw(context, 1.0f)}, null, null), GravityCompat.START, 1), new ClipDrawable(ouw(0, Integer.valueOf(Color.parseColor("#fff85959")), new int[]{osn.ouw(context, 1.5f)}, new int[]{-1, osn.ouw(context, 1.0f)}, null, null), GravityCompat.START, 1)});
                break;
            case 4:
                drawableOuw = ouw(ouw(0, Integer.valueOf(com.bytedance.sdk.component.utils.vpp.ra(context, "tt_fde6e6e6")), null, null, null, null), ouw(0, Integer.valueOf(com.bytedance.sdk.component.utils.vpp.ra(context, "tt_fdffffff")), null, null, null, null));
                break;
            case 5:
                drawableOuw = ouw(ouw(0, Integer.valueOf(com.bytedance.sdk.component.utils.vpp.ra(context, "tt_2a90d7")), new int[]{osn.ouw(context, 6.0f)}, null, Integer.valueOf(osn.ouw(context, 1.0f)), Integer.valueOf(com.bytedance.sdk.component.utils.vpp.ra(context, "@color/tt_7f2a90d7"))), ouw(0, Integer.valueOf(com.bytedance.sdk.component.utils.vpp.ra(context, "tt_2a90d7")), new int[]{osn.ouw(context, 6.0f)}, null, Integer.valueOf(osn.ouw(context, 1.0f)), Integer.valueOf(com.bytedance.sdk.component.utils.vpp.ra(context, "@color/tt_2a90d7"))));
                break;
            case 6:
                drawableOuw = com.bytedance.sdk.component.utils.vpp.lh(context, "tt_lefterbackicon_titlebar");
                break;
            case 7:
                drawableOuw = ouw(1, -1, null, new int[]{osn.ouw(context, 15.0f), osn.ouw(context, 15.0f)}, Integer.valueOf(osn.ouw(context, 1.0f)), 0);
                break;
            case 8:
                drawableOuw = ouw(com.bytedance.sdk.component.utils.vpp.lh(context, "tt_new_pause_video_press"), com.bytedance.sdk.component.utils.vpp.lh(context, "tt_new_pause_video"));
                break;
            case 9:
                drawableOuw = ouw(ouw(0, Integer.valueOf(Color.parseColor("#33f32830")), new int[]{osn.ouw(context, 4.0f)}, null, null, null), ouw(0, Integer.valueOf(Color.parseColor("#f32830")), new int[]{osn.ouw(context, 4.0f)}, null, null, null));
                break;
            case 10:
                drawableOuw = ouw(0, -1, new int[]{osn.ouw(context, 12.0f), osn.ouw(context, 12.0f), 0, 0}, null, null, null);
                break;
            case 11:
                drawableOuw = ouw(0, Integer.valueOf(com.bytedance.sdk.component.utils.vpp.ra(context, "tt_00000000")), new int[]{osn.ouw(context, 30.0f)}, null, Integer.valueOf(osn.ouw(context, 1.0f)), -1);
                break;
            case 12:
                drawableOuw = ouw(ouw(0, Integer.valueOf(com.bytedance.sdk.component.utils.vpp.ra(context, "tt_fde6e6e6")), new int[]{0, 0, osn.ouw(context, 5.0f), osn.ouw(context, 5.0f)}, null, null, null), ouw(0, Integer.valueOf(com.bytedance.sdk.component.utils.vpp.ra(context, "tt_fdffffff")), new int[]{0, 0, osn.ouw(context, 5.0f), osn.ouw(context, 5.0f)}, null, null, null));
                break;
            case 13:
                drawableOuw = ouw(1, -1, null, new int[]{osn.ouw(context, 18.0f), osn.ouw(context, 18.0f)}, null, null);
                break;
            case 14:
                drawableOuw = ouw(0, -1, new int[]{osn.ouw(context, 6.0f)}, null, Integer.valueOf(osn.ouw(context, 0.8f)), -1);
                break;
            case 15:
                drawableOuw = ouw(0, null, null, null, Integer.valueOf(osn.ouw(context, 1.5f)), -1);
                break;
            case 16:
                drawableOuw = ouw(com.bytedance.sdk.component.utils.vpp.lh(context, "tt_close_move_details_pressed"), com.bytedance.sdk.component.utils.vpp.lh(context, "tt_close_move_details_normal"));
                break;
            case 17:
                drawableOuw = ouw(1, Integer.valueOf(Color.parseColor("#99333333")), null, new int[]{osn.ouw(context, 28.0f), osn.ouw(context, 28.0f)}, null, null);
                break;
            case 18:
                drawableOuw = ouw(ouw(1, -1, null, new int[]{osn.ouw(context, 22.0f), osn.ouw(context, 22.0f)}, Integer.valueOf(osn.ouw(context, 1.0f)), 0), ouw(1, -1, null, new int[]{osn.ouw(context, 15.0f), osn.ouw(context, 15.0f)}, Integer.valueOf(osn.ouw(context, 1.0f)), 0));
                break;
            case 19:
                drawableOuw = ouw(1, Integer.valueOf(Color.parseColor("#99333333")), null, new int[]{osn.ouw(context, 28.0f), osn.ouw(context, 28.0f)}, null, null);
                break;
            case 20:
                drawableOuw = ouw(com.bytedance.sdk.component.utils.vpp.lh(context, "tt_new_play_video"), com.bytedance.sdk.component.utils.vpp.lh(context, "tt_new_play_video"));
                break;
            case 21:
                drawableOuw = ouw(com.bytedance.sdk.component.utils.vpp.lh(context, "tt_refreshing_video_textpage_pressed"), com.bytedance.sdk.component.utils.vpp.lh(context, "tt_refreshing_video_textpage_normal"));
                break;
            case 22:
                drawableOuw = new LayerDrawable(new Drawable[]{ouw(0, Integer.valueOf(Color.parseColor("#4DFC625C")), new int[]{osn.ouw(context, 3.0f)}, null, null, null), new ClipDrawable(ouw(0, Integer.valueOf(Color.parseColor("#FC625C")), new int[]{osn.ouw(context, 3.0f)}, null, null, null), GravityCompat.START, 1)});
                break;
            case 23:
                drawableOuw = ouw(ouw(1, -1, null, new int[]{osn.ouw(context, 18.0f), osn.ouw(context, 18.0f)}, Integer.valueOf(osn.ouw(context, 1.0f)), 0), ouw(1, -1, null, new int[]{osn.ouw(context, 18.0f), osn.ouw(context, 18.0f)}, Integer.valueOf(osn.ouw(context, 1.0f)), 0));
                break;
            case 24:
                drawableOuw = ouw(0, null, null, null, Integer.valueOf(osn.ouw(context, 1.5f)), Integer.valueOf(Color.parseColor("#ABACB0")));
                break;
            case 25:
                drawableOuw = ouw(1, Integer.valueOf(Color.parseColor("#99333333")), null, new int[]{osn.ouw(context, 28.0f), osn.ouw(context, 28.0f)}, null, null);
                break;
            case 26:
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setGradientType(0);
                gradientDrawable.setColors(new int[]{com.bytedance.sdk.component.utils.vpp.ra(context, "tt_ff1a1a1a"), com.bytedance.sdk.component.utils.vpp.ra(context, "tt_00000000")});
                gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
                drawableOuw = gradientDrawable;
                break;
            case 27:
                drawableOuw = ouw(0, null, new int[]{osn.ouw(context, 6.0f), 0, 0, osn.ouw(context, 6.0f)}, null, Integer.valueOf(osn.ouw(context, 1.5f)), -1);
                break;
            case 28:
                Drawable drawableLh = com.bytedance.sdk.component.utils.vpp.lh(context, "tt_mute");
                StateListDrawable stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(new int[0], drawableLh);
                stateListDrawable.setAutoMirrored(true);
                drawableOuw = stateListDrawable;
                break;
            case 29:
                drawableOuw = ouw(0, Integer.valueOf(com.bytedance.sdk.component.utils.vpp.ra(context, "tt_fdffffff")), new int[]{osn.ouw(context, 5.0f), osn.ouw(context, 5.0f), 0, 0}, null, null, null);
                break;
            case 30:
                drawableOuw = ouw(0, -1, new int[]{osn.ouw(context, 4.0f)}, null, Integer.valueOf(osn.ouw(context, 1.0f)), Integer.valueOf(Color.parseColor("#0F161823")));
                break;
            case 31:
                drawableOuw = ouw(0, Integer.valueOf(Color.parseColor("#ccffffff")), new int[]{osn.ouw(context, 18.0f)}, null, null, null);
                break;
            case 32:
                drawableOuw = ouw(0, Integer.valueOf(Color.parseColor("#ff0088ff")), new int[]{osn.ouw(context, 6.0f)}, null, null, null);
                break;
            case 33:
                GradientDrawable gradientDrawableOuw = ouw(0, Integer.valueOf(Color.parseColor("#EAEAEA")), new int[]{osn.ouw(context, 50.0f)}, null, null, null);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(osn.ouw(context, 15.0f));
                gradientDrawable2.setColors(new int[]{Color.parseColor("#1A73E8"), Color.parseColor("#569FFF")});
                gradientDrawable2.setGradientType(0);
                gradientDrawable2.setOrientation(GradientDrawable.Orientation.BOTTOM_TOP);
                drawableOuw = new LayerDrawable(new Drawable[]{gradientDrawableOuw, new ScaleDrawable(gradientDrawable2, GravityCompat.START, 1.0f, -1.0f)});
                break;
            case 34:
                drawableOuw = ouw(0, Integer.valueOf(Color.parseColor("#26000000")), new int[]{osn.ouw(context, 4.0f)}, null, null, null);
                break;
            case 35:
                drawableOuw = ouw(0, Integer.valueOf(Color.parseColor("#ff2f87f8")), new int[]{osn.ouw(context, 2.0f)}, new int[]{osn.ouw(context, 98.0f), osn.ouw(context, 25.0f)}, null, null);
                break;
            case 36:
                drawableOuw = ouw(1, -1, null, new int[]{osn.ouw(context, 18.0f), osn.ouw(context, 18.0f)}, Integer.valueOf(osn.ouw(context, 1.0f)), 0);
                break;
            case 37:
                drawableOuw = ouw(ouw(0, Integer.valueOf(Color.parseColor("#2582c3")), null, null, null, null), ouw(0, Integer.valueOf(Color.parseColor("#2a90d7")), null, null, null, null));
                break;
            case 38:
                drawableOuw = ouw(0, null, new int[]{0, osn.ouw(context, 6.0f), osn.ouw(context, 6.0f), 0}, null, Integer.valueOf(osn.ouw(context, 1.5f)), -1);
                break;
            case 39:
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setShape(0);
                gradientDrawable3.setSize(osn.ouw(context, 280.0f), osn.ouw(context, 38.0f));
                gradientDrawable3.setCornerRadius(osn.ouw(context, 19.0f));
                gradientDrawable3.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
                gradientDrawable3.setColors(new int[]{Color.parseColor("#fff02d42"), Color.parseColor("#fffc4b3c")});
                gradientDrawable3.setGradientType(0);
                gradientDrawable3.setUseLevel(true);
                drawableOuw = gradientDrawable3;
                break;
            case 40:
                drawableOuw = new LayerDrawable(new Drawable[]{ouw(0, Integer.valueOf(Color.parseColor("#33007AFF")), null, null, null, null), new ClipDrawable(ouw(0, Integer.valueOf(Color.parseColor("#007AFF")), null, null, null, null), GravityCompat.START, 1)});
                break;
            case 41:
                GradientDrawable gradientDrawable4 = new GradientDrawable();
                gradientDrawable4.setShape(0);
                gradientDrawable4.setSize(osn.ouw(context, 258.0f), osn.ouw(context, 43.0f));
                gradientDrawable4.setCornerRadius(osn.ouw(context, 22.0f));
                gradientDrawable4.setColors(new int[]{Color.parseColor("#73CBFC"), Color.parseColor("#3F9CF7")});
                gradientDrawable4.setGradientType(0);
                drawableOuw = gradientDrawable4;
                break;
            case 42:
                drawableOuw = ouw(1, -1, null, new int[]{osn.ouw(context, 22.0f), osn.ouw(context, 22.0f)}, Integer.valueOf(osn.ouw(context, 1.0f)), 0);
                break;
            case 43:
                Drawable drawableLh2 = com.bytedance.sdk.component.utils.vpp.lh(context, "tt_unmute");
                StateListDrawable stateListDrawable2 = new StateListDrawable();
                stateListDrawable2.addState(new int[0], drawableLh2);
                stateListDrawable2.setAutoMirrored(true);
                drawableOuw = stateListDrawable2;
                break;
            case 44:
                drawableOuw = ouw(com.bytedance.sdk.component.utils.vpp.lh(context, "tt_titlebar_close_press_for_dark"), com.bytedance.sdk.component.utils.vpp.lh(context, "tt_titlebar_close_for_dark"));
                break;
            case 45:
                drawableOuw = ouw(0, null, new int[]{0, osn.ouw(context, 6.0f), osn.ouw(context, 6.0f), 0}, null, Integer.valueOf(osn.ouw(context, 1.5f)), Integer.valueOf(Color.parseColor("#ABACB0")));
                break;
            case 46:
                drawableOuw = ouw(0, Integer.valueOf(Color.parseColor("#141A73E8")), new int[]{osn.ouw(context, 5.0f)}, null, null, null);
                break;
            case 47:
                Drawable drawableLh3 = com.bytedance.sdk.component.utils.vpp.lh(context, "tt_shadow_lefterback_titlebar_press_withoutnight");
                StateListDrawable stateListDrawableOuw = ouw(drawableLh3, com.bytedance.sdk.component.utils.vpp.lh(context, "tt_shadow_lefterback_titlebar_withoutnight"));
                stateListDrawableOuw.addState(new int[]{-16842910}, drawableLh3);
                drawableOuw = stateListDrawableOuw;
                break;
            case 48:
                drawableOuw = ouw(1, Integer.valueOf(com.bytedance.sdk.component.utils.vpp.ra(context, "tt_e0e0e0")), null, null, null, null);
                break;
            case 49:
                drawableOuw = new LayerDrawable(new Drawable[]{ouw(0, -1, new int[]{0}, null, null, null), new ClipDrawable(ouw(0, Integer.valueOf(Color.parseColor("#1A73E8")), new int[]{0}, null, null, null), 3, 1)});
                break;
            case 50:
                drawableOuw = ouw(0, Integer.valueOf(com.bytedance.sdk.component.utils.vpp.ra(context, "tt_4a90e2")), new int[]{osn.ouw(context, 4.0f)}, null, null, null);
                break;
            case 51:
                drawableOuw = ouw(ouw(0, Integer.valueOf(Color.parseColor("#0D000000")), new int[]{osn.ouw(context, 2.0f)}, null, Integer.valueOf(osn.ouw(context, 1.0f)), Integer.valueOf(Color.parseColor("#1F000000"))), ouw(0, -1, new int[]{osn.ouw(context, 2.0f)}, null, Integer.valueOf(osn.ouw(context, 1.0f)), Integer.valueOf(Color.parseColor("#1618231F"))));
                break;
            case 52:
                drawableOuw = ouw(0, null, new int[]{osn.ouw(context, 6.0f), 0, 0, osn.ouw(context, 6.0f)}, null, Integer.valueOf(osn.ouw(context, 1.5f)), Integer.valueOf(Color.parseColor("#ABACB0")));
                break;
            case 53:
                drawableOuw = ouw(1, Integer.valueOf(Color.parseColor("#30333333")), null, new int[]{osn.ouw(context, 28.0f), osn.ouw(context, 28.0f)}, null, null);
                break;
            case 54:
                Drawable drawableLh4 = com.bytedance.sdk.component.utils.vpp.lh(context, "tt_lefterbackicon_titlebar_press");
                StateListDrawable stateListDrawable3 = new StateListDrawable();
                stateListDrawable3.addState(new int[0], drawableLh4);
                stateListDrawable3.setAutoMirrored(true);
                drawableOuw = stateListDrawable3;
                break;
            case 55:
                drawableOuw = ouw(0, Integer.valueOf(Color.parseColor("#ff007aff")), new int[]{osn.ouw(context, 18.0f)}, null, null, null);
                break;
            case 56:
                drawableOuw = ouw(0, Integer.valueOf(Color.parseColor("#33FFFFFF")), new int[]{osn.ouw(context, 15.0f)}, null, null, null);
                break;
            case 57:
                Drawable drawableLh5 = com.bytedance.sdk.component.utils.vpp.lh(context, "tt_shadow_lefterback_titlebar_press");
                StateListDrawable stateListDrawableOuw2 = ouw(drawableLh5, com.bytedance.sdk.component.utils.vpp.lh(context, "tt_shadow_lefterback_titlebar"));
                stateListDrawableOuw2.addState(new int[]{-16842910}, drawableLh5);
                drawableOuw = stateListDrawableOuw2;
                break;
            case 58:
                drawableOuw = ouw(ouw(0, Integer.valueOf(com.bytedance.sdk.component.utils.vpp.ra(context, "tt_fde6e6e6")), new int[]{osn.ouw(context, 5.0f), osn.ouw(context, 5.0f), 0, 0}, null, null, null), ouw(0, Integer.valueOf(com.bytedance.sdk.component.utils.vpp.ra(context, "tt_fdffffff")), new int[]{osn.ouw(context, 5.0f), osn.ouw(context, 5.0f), 0, 0}, null, null, null));
                break;
            case 59:
                RotateDrawable rotateDrawable = new RotateDrawable();
                rotateDrawable.setDrawable(com.bytedance.sdk.component.utils.vpp.lh(context, "tt_normalscreen_loading"));
                rotateDrawable.setFromDegrees(0.0f);
                rotateDrawable.setToDegrees(360.0f);
                rotateDrawable.setPivotX(0.5f);
                rotateDrawable.setPivotY(0.5f);
                drawableOuw = rotateDrawable;
                break;
            case 60:
                drawableOuw = ouw(0, Integer.valueOf(Color.parseColor("#66161823")), new int[]{osn.ouw(context, 14.0f)}, null, null, null);
                break;
            case 61:
                drawableOuw = ouw(0, -1, new int[]{osn.ouw(context, 14.5f)}, null, null, null);
                break;
            case 62:
                drawableOuw = com.bytedance.sdk.component.utils.vpp.lh(context, "tt_titlebar_close_drawable");
                break;
            default:
                drawableOuw = null;
                break;
        }
        map.put(str, new Pair<>(drawableOuw, 1));
        return drawableOuw;
    }
}
