package io.bidmachine.media3.exoplayer.audio;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.net.Uri;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.r2;
import com.google.common.primitives.Ints;
import com.ironsource.C3426d4;
import io.bidmachine.media3.common.AudioAttributes;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.MimeTypes;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
@UnstableApi
public final class AudioCapabilities {

    @VisibleForTesting
    public static final int DEFAULT_MAX_CHANNEL_COUNT = 10;

    @VisibleForTesting
    public static final int DEFAULT_SAMPLE_RATE_HZ = 48000;
    private static final String EXTERNAL_SURROUND_SOUND_KEY = "external_surround_sound_enabled";
    private static final String FORCE_EXTERNAL_SURROUND_SOUND_KEY = "use_external_surround_sound_flag";
    private final SparseArray<e> encodingToAudioProfile;
    private final int maxChannelCount;
    public static final AudioCapabilities DEFAULT_AUDIO_CAPABILITIES = new AudioCapabilities(ImmutableList.of(e.DEFAULT_AUDIO_PROFILE));

    @SuppressLint({"InlinedApi"})
    private static final ImmutableList<Integer> EXTERNAL_SURROUND_SOUND_ENCODINGS = ImmutableList.of(2, 5, 6);

    @VisibleForTesting
    public static final ImmutableMap<Integer, Integer> ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS = new ImmutableMap.b().g(5, 6).g(17, 6).g(7, 6).g(30, 10).g(18, 6).g(6, 8).g(8, 8).g(14, 8).c();

    @RequiresApi(23)
    public static final class b {
        private b() {
        }

        @DoNotInline
        public static boolean isBluetoothConnected(AudioManager audioManager, @Nullable eg.a aVar) {
            AudioDeviceInfo[] devices = aVar == null ? ((AudioManager) Assertions.checkNotNull(audioManager)).getDevices(2) : new AudioDeviceInfo[]{aVar.audioDeviceInfo};
            ImmutableSet<Integer> allBluetoothDeviceTypes = getAllBluetoothDeviceTypes();
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                if (allBluetoothDeviceTypes.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                    return true;
                }
            }
            return false;
        }

        @DoNotInline
        private static ImmutableSet<Integer> getAllBluetoothDeviceTypes() {
            ImmutableSet.a aVarJ = new ImmutableSet.a().j(8, 7);
            int i10 = Util.SDK_INT;
            if (i10 >= 31) {
                aVarJ.j(26, 27);
            }
            if (i10 >= 33) {
                aVarJ.a(30);
            }
            return aVarJ.n();
        }
    }

    @RequiresApi(29)
    public static final class c {
        private c() {
        }

        @DoNotInline
        public static int getMaxSupportedChannelCountForPassthrough(int i10, int i11, AudioAttributes audioAttributes) {
            for (int i12 = 10; i12 > 0; i12--) {
                int audioTrackChannelConfig = Util.getAudioTrackChannelConfig(i12);
                if (audioTrackChannelConfig != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11).setChannelMask(audioTrackChannelConfig).build(), audioAttributes.getAudioAttributesV21().audioAttributes)) {
                    return i12;
                }
            }
            return 0;
        }

        @DoNotInline
        public static ImmutableList<Integer> getDirectPlaybackSupportedEncodings(AudioAttributes audioAttributes) {
            ImmutableList.a aVarBuilder = ImmutableList.builder();
            r2<Integer> it = AudioCapabilities.ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS.keySet().iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (Util.SDK_INT >= Util.getApiLevelThatAudioFormatIntroducedAudioEncoding(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), audioAttributes.getAudioAttributesV21().audioAttributes)) {
                    aVarBuilder.a(Integer.valueOf(iIntValue));
                }
            }
            aVarBuilder.a(2);
            return aVarBuilder.m();
        }
    }

    public static final class e {
        public static final e DEFAULT_AUDIO_PROFILE;

        @Nullable
        private final ImmutableSet<Integer> channelMasks;
        public final int encoding;
        public final int maxChannelCount;

        @RequiresApi(33)
        public e(int i10, Set<Integer> set) {
            this.encoding = i10;
            ImmutableSet<Integer> immutableSetCopyOf = ImmutableSet.copyOf((Collection) set);
            this.channelMasks = immutableSetCopyOf;
            r2<Integer> it = immutableSetCopyOf.iterator();
            int iMax = 0;
            while (it.hasNext()) {
                iMax = Math.max(iMax, Integer.bitCount(it.next().intValue()));
            }
            this.maxChannelCount = iMax;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.encoding == eVar.encoding && this.maxChannelCount == eVar.maxChannelCount && Util.areEqual(this.channelMasks, eVar.channelMasks);
        }

        static {
            DEFAULT_AUDIO_PROFILE = Util.SDK_INT >= 33 ? new e(2, getAllChannelMasksForMaxChannelCount(10)) : new e(2, 10);
        }

        private static ImmutableSet<Integer> getAllChannelMasksForMaxChannelCount(int i10) {
            ImmutableSet.a aVar = new ImmutableSet.a();
            for (int i11 = 1; i11 <= i10; i11++) {
                aVar.a(Integer.valueOf(Util.getAudioTrackChannelConfig(i11)));
            }
            return aVar.n();
        }

        public int getMaxSupportedChannelCountForPassthrough(int i10, AudioAttributes audioAttributes) {
            if (this.channelMasks != null) {
                return this.maxChannelCount;
            }
            return Util.SDK_INT >= 29 ? c.getMaxSupportedChannelCountForPassthrough(this.encoding, i10, audioAttributes) : ((Integer) Assertions.checkNotNull(AudioCapabilities.ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS.getOrDefault(Integer.valueOf(this.encoding), 0))).intValue();
        }

        public int hashCode() {
            int i10 = ((this.encoding * 31) + this.maxChannelCount) * 31;
            ImmutableSet<Integer> immutableSet = this.channelMasks;
            return i10 + (immutableSet == null ? 0 : immutableSet.hashCode());
        }

        public boolean supportsChannelCount(int i10) {
            if (this.channelMasks == null) {
                return i10 <= this.maxChannelCount;
            }
            int audioTrackChannelConfig = Util.getAudioTrackChannelConfig(i10);
            if (audioTrackChannelConfig == 0) {
                return false;
            }
            return this.channelMasks.contains(Integer.valueOf(audioTrackChannelConfig));
        }

        public String toString() {
            return "AudioProfile[format=" + this.encoding + ", maxChannelCount=" + this.maxChannelCount + ", channelMasks=" + this.channelMasks + C3426d4.j.f28588e;
        }

        public e(int i10, int i11) {
            this.encoding = i10;
            this.maxChannelCount = i11;
            this.channelMasks = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(33)
    @SuppressLint({"WrongConstant"})
    public static ImmutableList<e> getAudioProfiles(List<AudioProfile> list) {
        HashMap map = new HashMap();
        map.put(2, new HashSet(Ints.c(12)));
        for (int i10 = 0; i10 < list.size(); i10++) {
            AudioProfile audioProfile = list.get(i10);
            if (audioProfile.getEncapsulationType() != 1) {
                int format = audioProfile.getFormat();
                if (Util.isEncodingLinearPcm(format) || ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS.containsKey(Integer.valueOf(format))) {
                    if (map.containsKey(Integer.valueOf(format))) {
                        ((Set) Assertions.checkNotNull((Set) map.get(Integer.valueOf(format)))).addAll(Ints.c(audioProfile.getChannelMasks()));
                    } else {
                        map.put(Integer.valueOf(format), new HashSet(Ints.c(audioProfile.getChannelMasks())));
                    }
                }
            }
        }
        ImmutableList.a aVarBuilder = ImmutableList.builder();
        for (Map.Entry entry : map.entrySet()) {
            aVarBuilder.a(new e(((Integer) entry.getKey()).intValue(), (Set<Integer>) entry.getValue()));
        }
        return aVarBuilder.m();
    }

    @Deprecated
    public static AudioCapabilities getCapabilities(Context context) {
        return getCapabilities(context, AudioAttributes.DEFAULT, null);
    }

    @SuppressLint({"UnprotectedReceiver"})
    public static AudioCapabilities getCapabilitiesInternal(Context context, AudioAttributes audioAttributes, @Nullable eg.a aVar) {
        return getCapabilitiesInternal(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), audioAttributes, aVar);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioCapabilities)) {
            return false;
        }
        AudioCapabilities audioCapabilities = (AudioCapabilities) obj;
        return Util.contentEquals(this.encodingToAudioProfile, audioCapabilities.encodingToAudioProfile) && this.maxChannelCount == audioCapabilities.maxChannelCount;
    }

    @Nullable
    @Deprecated
    public Pair<Integer, Integer> getEncodingAndChannelConfigForPassthrough(Format format) {
        return getEncodingAndChannelConfigForPassthrough(format, AudioAttributes.DEFAULT);
    }

    @Deprecated
    public boolean isPassthroughPlaybackSupported(Format format) {
        return isPassthroughPlaybackSupported(format, AudioAttributes.DEFAULT);
    }

    @RequiresApi(33)
    public static final class d {
        private d() {
        }

        @Nullable
        @DoNotInline
        public static eg.a getDefaultRoutedDeviceForAttributes(AudioManager audioManager, AudioAttributes audioAttributes) {
            try {
                List<AudioDeviceInfo> audioDevicesForAttributes = ((AudioManager) Assertions.checkNotNull(audioManager)).getAudioDevicesForAttributes(audioAttributes.getAudioAttributesV21().audioAttributes);
                if (audioDevicesForAttributes.isEmpty()) {
                    return null;
                }
                return new eg.a(audioDevicesForAttributes.get(0));
            } catch (RuntimeException unused) {
                return null;
            }
        }

        @DoNotInline
        public static AudioCapabilities getCapabilitiesInternalForDirectPlayback(AudioManager audioManager, AudioAttributes audioAttributes) {
            return new AudioCapabilities(AudioCapabilities.getAudioProfiles(audioManager.getDirectProfilesForAttributes(audioAttributes.getAudioAttributesV21().audioAttributes)));
        }
    }

    @Deprecated
    public AudioCapabilities(@Nullable int[] iArr, int i10) {
        this(getAudioProfiles(iArr, i10));
    }

    private static boolean deviceMaySetExternalSurroundSoundGlobalSetting() {
        String str = Util.MANUFACTURER;
        return "Amazon".equals(str) || "Xiaomi".equals(str);
    }

    public static AudioCapabilities getCapabilities(Context context, AudioAttributes audioAttributes, @Nullable AudioDeviceInfo audioDeviceInfo) {
        return getCapabilitiesInternal(context, audioAttributes, (Util.SDK_INT < 23 || audioDeviceInfo == null) ? null : new eg.a(audioDeviceInfo));
    }

    private static int getChannelConfigForPassthrough(int i10) {
        int i11 = Util.SDK_INT;
        if (i11 <= 28) {
            if (i10 == 7) {
                i10 = 8;
            } else if (i10 == 3 || i10 == 4 || i10 == 5) {
                i10 = 6;
            }
        }
        if (i11 <= 26 && "fugu".equals(Util.DEVICE) && i10 == 1) {
            i10 = 2;
        }
        return Util.getAudioTrackChannelConfig(i10);
    }

    @Nullable
    public Pair<Integer, Integer> getEncodingAndChannelConfigForPassthrough(Format format, AudioAttributes audioAttributes) {
        int encoding = MimeTypes.getEncoding((String) Assertions.checkNotNull(format.sampleMimeType), format.codecs);
        if (!ALL_SURROUND_ENCODINGS_AND_MAX_CHANNELS.containsKey(Integer.valueOf(encoding))) {
            return null;
        }
        if (encoding == 18 && !supportsEncoding(18)) {
            encoding = 6;
        } else if ((encoding == 8 && !supportsEncoding(8)) || (encoding == 30 && !supportsEncoding(30))) {
            encoding = 7;
        }
        if (!supportsEncoding(encoding)) {
            return null;
        }
        e eVar = (e) Assertions.checkNotNull(this.encodingToAudioProfile.get(encoding));
        int maxSupportedChannelCountForPassthrough = format.channelCount;
        if (maxSupportedChannelCountForPassthrough == -1 || encoding == 18) {
            int i10 = format.sampleRate;
            if (i10 == -1) {
                i10 = 48000;
            }
            maxSupportedChannelCountForPassthrough = eVar.getMaxSupportedChannelCountForPassthrough(i10, audioAttributes);
        } else if (!format.sampleMimeType.equals("audio/vnd.dts.uhd;profile=p2") || Util.SDK_INT >= 33) {
            if (!eVar.supportsChannelCount(maxSupportedChannelCountForPassthrough)) {
                return null;
            }
        } else if (maxSupportedChannelCountForPassthrough > 10) {
            return null;
        }
        int channelConfigForPassthrough = getChannelConfigForPassthrough(maxSupportedChannelCountForPassthrough);
        if (channelConfigForPassthrough == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(encoding), Integer.valueOf(channelConfigForPassthrough));
    }

    public int getMaxChannelCount() {
        return this.maxChannelCount;
    }

    public int hashCode() {
        return this.maxChannelCount + (Util.contentHashCode(this.encodingToAudioProfile) * 31);
    }

    public boolean isPassthroughPlaybackSupported(Format format, AudioAttributes audioAttributes) {
        return getEncodingAndChannelConfigForPassthrough(format, audioAttributes) != null;
    }

    public boolean supportsEncoding(int i10) {
        return Util.contains(this.encodingToAudioProfile, i10);
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.maxChannelCount + ", audioProfiles=" + this.encodingToAudioProfile + C3426d4.j.f28588e;
    }

    private AudioCapabilities(List<e> list) {
        this.encodingToAudioProfile = new SparseArray<>();
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            this.encodingToAudioProfile.put(eVar.encoding, eVar);
        }
        int iMax = 0;
        for (int i11 = 0; i11 < this.encodingToAudioProfile.size(); i11++) {
            iMax = Math.max(iMax, this.encodingToAudioProfile.valueAt(i11).maxChannelCount);
        }
        this.maxChannelCount = iMax;
    }

    @Nullable
    public static Uri getExternalSurroundSoundGlobalSettingUri() {
        if (deviceMaySetExternalSurroundSoundGlobalSetting()) {
            return Settings.Global.getUriFor(EXTERNAL_SURROUND_SOUND_KEY);
        }
        return null;
    }

    @SuppressLint({"InlinedApi"})
    public static AudioCapabilities getCapabilitiesInternal(Context context, @Nullable Intent intent, AudioAttributes audioAttributes, @Nullable eg.a aVar) {
        AudioManager audioManager = (AudioManager) Assertions.checkNotNull(context.getSystemService("audio"));
        if (aVar == null) {
            aVar = Util.SDK_INT >= 33 ? d.getDefaultRoutedDeviceForAttributes(audioManager, audioAttributes) : null;
        }
        int i10 = Util.SDK_INT;
        if (i10 >= 33 && (Util.isTv(context) || Util.isAutomotive(context))) {
            return d.getCapabilitiesInternalForDirectPlayback(audioManager, audioAttributes);
        }
        if (i10 >= 23 && b.isBluetoothConnected(audioManager, aVar)) {
            return DEFAULT_AUDIO_CAPABILITIES;
        }
        ImmutableSet.a aVar2 = new ImmutableSet.a();
        aVar2.a(2);
        if (i10 >= 29 && (Util.isTv(context) || Util.isAutomotive(context))) {
            aVar2.k(c.getDirectPlaybackSupportedEncodings(audioAttributes));
            return new AudioCapabilities(getAudioProfiles(Ints.n(aVar2.n()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z10 = Settings.Global.getInt(contentResolver, FORCE_EXTERNAL_SURROUND_SOUND_KEY, 0) == 1;
        if ((z10 || deviceMaySetExternalSurroundSoundGlobalSetting()) && Settings.Global.getInt(contentResolver, EXTERNAL_SURROUND_SOUND_KEY, 0) == 1) {
            aVar2.k(EXTERNAL_SURROUND_SOUND_ENCODINGS);
        }
        if (intent != null && !z10 && intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 1) {
            int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
            if (intArrayExtra != null) {
                aVar2.k(Ints.c(intArrayExtra));
            }
            return new AudioCapabilities(getAudioProfiles(Ints.n(aVar2.n()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
        }
        return new AudioCapabilities(getAudioProfiles(Ints.n(aVar2.n()), 10));
    }

    private static ImmutableList<e> getAudioProfiles(@Nullable int[] iArr, int i10) {
        ImmutableList.a aVarBuilder = ImmutableList.builder();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i11 : iArr) {
            aVarBuilder.a(new e(i11, i10));
        }
        return aVarBuilder.m();
    }
}
