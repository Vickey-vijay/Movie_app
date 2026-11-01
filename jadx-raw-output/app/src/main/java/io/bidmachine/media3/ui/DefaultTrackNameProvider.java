package io.bidmachine.media3.ui;

import android.content.res.Resources;
import android.text.TextUtils;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.MimeTypes;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
@UnstableApi
public class DefaultTrackNameProvider implements TrackNameProvider {
    private final Resources resources;

    private String buildLanguageOrLabelString(Format format) {
        String strJoinWithSeparator = joinWithSeparator(buildLanguageString(format), buildRoleString(format));
        return TextUtils.isEmpty(strJoinWithSeparator) ? buildLabelString(format) : strJoinWithSeparator;
    }

    private String joinWithSeparator(String... strArr) {
        String string = "";
        for (String str : strArr) {
            if (str.length() > 0) {
                string = TextUtils.isEmpty(string) ? str : this.resources.getString(R.string.exo_item_list, string, str);
            }
        }
        return string;
    }

    private String buildAudioChannelString(Format format) {
        int i10 = format.channelCount;
        if (i10 == -1 || i10 < 1) {
            return "";
        }
        if (i10 == 1) {
            return this.resources.getString(R.string.exo_track_mono);
        }
        if (i10 == 2) {
            return this.resources.getString(R.string.exo_track_stereo);
        }
        if (i10 == 6 || i10 == 7) {
            return this.resources.getString(R.string.exo_track_surround_5_point_1);
        }
        return i10 != 8 ? this.resources.getString(R.string.exo_track_surround) : this.resources.getString(R.string.exo_track_surround_7_point_1);
    }

    private String buildBitrateString(Format format) {
        int i10 = format.bitrate;
        return i10 == -1 ? "" : this.resources.getString(R.string.exo_track_bitrate, Float.valueOf(i10 / 1000000.0f));
    }

    private String buildLabelString(Format format) {
        return TextUtils.isEmpty(format.label) ? "" : format.label;
    }

    private String buildLanguageString(Format format) {
        String str = format.language;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            return "";
        }
        Locale localeForLanguageTag = Util.SDK_INT >= 21 ? Locale.forLanguageTag(str) : new Locale(str);
        Locale defaultDisplayLocale = Util.getDefaultDisplayLocale();
        String displayName = localeForLanguageTag.getDisplayName(defaultDisplayLocale);
        if (TextUtils.isEmpty(displayName)) {
            return "";
        }
        try {
            int iOffsetByCodePoints = displayName.offsetByCodePoints(0, 1);
            return displayName.substring(0, iOffsetByCodePoints).toUpperCase(defaultDisplayLocale) + displayName.substring(iOffsetByCodePoints);
        } catch (IndexOutOfBoundsException unused) {
            return displayName;
        }
    }

    private String buildResolutionString(Format format) {
        int i10 = format.width;
        int i11 = format.height;
        return (i10 == -1 || i11 == -1) ? "" : this.resources.getString(R.string.exo_track_resolution, Integer.valueOf(i10), Integer.valueOf(i11));
    }

    private String buildRoleString(Format format) {
        String string = (format.roleFlags & 2) != 0 ? this.resources.getString(R.string.exo_track_role_alternate) : "";
        if ((format.roleFlags & 4) != 0) {
            string = joinWithSeparator(string, this.resources.getString(R.string.exo_track_role_supplementary));
        }
        if ((format.roleFlags & 8) != 0) {
            string = joinWithSeparator(string, this.resources.getString(R.string.exo_track_role_commentary));
        }
        return (format.roleFlags & 1088) != 0 ? joinWithSeparator(string, this.resources.getString(R.string.exo_track_role_closed_captions)) : string;
    }

    private static int inferPrimaryTrackType(Format format) {
        int trackType = MimeTypes.getTrackType(format.sampleMimeType);
        if (trackType != -1) {
            return trackType;
        }
        if (MimeTypes.getVideoMediaMimeType(format.codecs) != null) {
            return 2;
        }
        if (MimeTypes.getAudioMediaMimeType(format.codecs) != null) {
            return 1;
        }
        if (format.width == -1 && format.height == -1) {
            return (format.channelCount == -1 && format.sampleRate == -1) ? -1 : 1;
        }
        return 2;
    }

    public DefaultTrackNameProvider(Resources resources) {
        this.resources = (Resources) Assertions.checkNotNull(resources);
    }

    @Override // io.bidmachine.media3.ui.TrackNameProvider
    public String getTrackName(Format format) {
        String strBuildLanguageOrLabelString;
        int iInferPrimaryTrackType = inferPrimaryTrackType(format);
        if (iInferPrimaryTrackType == 2) {
            strBuildLanguageOrLabelString = joinWithSeparator(buildRoleString(format), buildResolutionString(format), buildBitrateString(format));
        } else if (iInferPrimaryTrackType == 1) {
            strBuildLanguageOrLabelString = joinWithSeparator(buildLanguageOrLabelString(format), buildAudioChannelString(format), buildBitrateString(format));
        } else {
            strBuildLanguageOrLabelString = buildLanguageOrLabelString(format);
        }
        if (strBuildLanguageOrLabelString.length() != 0) {
            return strBuildLanguageOrLabelString;
        }
        String str = format.language;
        if (str != null && !str.trim().isEmpty()) {
            return this.resources.getString(R.string.exo_track_unknown_name, str);
        }
        return this.resources.getString(R.string.exo_track_unknown);
    }
}
