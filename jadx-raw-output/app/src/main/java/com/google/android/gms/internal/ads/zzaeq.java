package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzaeq implements zzafa {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    private static final zzaep zzc = new zzaep(new zzaeo() { // from class: com.google.android.gms.internal.ads.zzaen
        @Override // com.google.android.gms.internal.ads.zzaeo
        public final /* synthetic */ Constructor zza() {
            int i10 = zzaeq.zza;
            if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(zzaeu.class).getConstructor(Integer.TYPE);
            }
            return null;
        }
    });
    private static final zzaep zzd = new zzaep(new zzaeo() { // from class: com.google.android.gms.internal.ads.zzaem
        @Override // com.google.android.gms.internal.ads.zzaeo
        public final /* synthetic */ Constructor zza() {
            int i10 = zzaeq.zza;
            return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(zzaeu.class).getConstructor(new Class[0]);
        }
    });

    @Nullable
    private zzguf zze;
    private final zzamd zzf = new zzaly();

    private final void zzc(int i10, List list) {
        switch (i10) {
            case 0:
                list.add(new zzaoc());
                break;
            case 1:
                list.add(new zzaof());
                break;
            case 2:
                list.add(new zzaoi(0));
                break;
            case 3:
                list.add(new zzagp(0));
                break;
            case 4:
                zzaeu zzaeuVarZza = zzc.zza(0);
                if (zzaeuVarZza == null) {
                    list.add(new zzahg(0));
                } else {
                    list.add(zzaeuVarZza);
                }
                break;
            case 5:
                list.add(new zzahj());
                break;
            case 6:
                list.add(new zzajh(this.zzf, 0));
                break;
            case 7:
                list.add(new zzajp(0));
                break;
            case 8:
                zzamd zzamdVar = this.zzf;
                list.add(new zzako(zzamdVar, 0, null, null, zzguf.zzi(), null));
                list.add(new zzakw(zzamdVar, 0));
                break;
            case 9:
                list.add(new zzalm());
                break;
            case 10:
                list.add(new zzapm());
                break;
            case 11:
                if (this.zze == null) {
                    this.zze = zzguf.zzi();
                }
                list.add(new zzapx(1, 0, this.zzf, new zzfg(0L), new zzaok(0, this.zze), 112800));
                break;
            case 12:
                list.add(new zzaqk());
                break;
            case 14:
                list.add(new zzahq(0));
                break;
            case 15:
                zzaeu zzaeuVarZza2 = zzd.zza(new Object[0]);
                if (zzaeuVarZza2 != null) {
                    list.add(zzaeuVarZza2);
                }
                break;
            case 16:
                list.add(new zzagt(0, this.zzf));
                break;
            case 17:
                list.add(new zzalw());
                break;
            case 18:
                list.add(new zzaqp());
                break;
            case 19:
                list.add(new zzahb());
                break;
            case 20:
                list.add(new zzahp(0));
                break;
            case 21:
                list.add(new zzaha());
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final synchronized zzaeu[] zza() {
        return zzb(Uri.EMPTY, new HashMap());
    }

    /* JADX WARN: Code duplicated, block: B:113:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:141:0x0203  */
    @Override // com.google.android.gms.internal.ads.zzafa
    public final synchronized zzaeu[] zzb(Uri uri, Map map) {
        ArrayList arrayList;
        int i10;
        int i11;
        arrayList = new ArrayList(21);
        List list = (List) map.get("Content-Type");
        String str = (list == null || list.isEmpty()) ? null : (String) list.get(0);
        if (str != null) {
            switch (zzas.zzh(str)) {
                case "audio/ac3":
                case "audio/eac3":
                case "audio/eac3-joc":
                    i10 = 0;
                    break;
                case "audio/ac4":
                    i10 = 1;
                    break;
                case "audio/amr":
                case "audio/3gpp":
                case "audio/amr-wb":
                    i10 = 3;
                    break;
                case "audio/flac":
                    i10 = 4;
                    break;
                case "video/x-flv":
                    i10 = 5;
                    break;
                case "audio/midi":
                    i10 = 15;
                    break;
                case "video/x-matroska":
                case "audio/x-matroska":
                case "video/webm":
                case "audio/webm":
                case "application/webm":
                    i10 = 6;
                    break;
                case "audio/mpeg":
                    i10 = 7;
                    break;
                case "video/mp4":
                case "audio/mp4":
                case "application/mp4":
                    i10 = 8;
                    break;
                case "audio/ogg":
                    i10 = 9;
                    break;
                case "video/mp2p":
                    i10 = 10;
                    break;
                case "video/mp2t":
                    i10 = 11;
                    break;
                case "audio/wav":
                    i10 = 12;
                    break;
                case "text/vtt":
                    i10 = 13;
                    break;
                case "image/jpeg":
                    i10 = 14;
                    break;
                case "video/x-msvideo":
                    i10 = 16;
                    break;
                case "image/png":
                    i10 = 17;
                    break;
                case "image/webp":
                    i10 = 18;
                    break;
                case "image/bmp":
                    i10 = 19;
                    break;
                case "image/heif":
                case "image/heic":
                    i10 = 20;
                    break;
                case "image/avif":
                    i10 = 21;
                    break;
                default:
                    i10 = -1;
                    break;
            }
        } else {
            i10 = -1;
        }
        if (i10 != -1) {
            zzc(i10, arrayList);
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            i11 = -1;
        } else if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            i11 = 0;
        } else if (lastPathSegment.endsWith(".ac4")) {
            i11 = 1;
        } else if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            i11 = 2;
        } else if (lastPathSegment.endsWith(".amr")) {
            i11 = 3;
        } else if (lastPathSegment.endsWith(".flac")) {
            i11 = 4;
        } else if (lastPathSegment.endsWith(".flv")) {
            i11 = 5;
        } else if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            i11 = 15;
        } else if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            i11 = 6;
        } else if (lastPathSegment.endsWith(".mp3")) {
            i11 = 7;
        } else if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            i11 = 8;
        } else if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            i11 = 9;
        } else if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            i11 = 10;
        } else if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            i11 = 11;
        } else if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            i11 = 12;
        } else if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            i11 = 13;
        } else if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            i11 = 14;
        } else if (lastPathSegment.endsWith(".avi")) {
            i11 = 16;
        } else if (lastPathSegment.endsWith(".png")) {
            i11 = 17;
        } else if (lastPathSegment.endsWith(".webp")) {
            i11 = 18;
        } else if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
            i11 = 19;
        } else if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
            i11 = 20;
        } else if (lastPathSegment.endsWith(".avif")) {
            i11 = 21;
        } else {
            i11 = -1;
        }
        if (i11 != -1 && i11 != i10) {
            zzc(i11, arrayList);
        }
        int[] iArr = zzb;
        for (int i12 = 0; i12 < 21; i12++) {
            int i13 = iArr[i12];
            if (i13 != i10 && i13 != i11) {
                zzc(i13, arrayList);
            }
        }
        return (zzaeu[]) arrayList.toArray(new zzaeu[0]);
    }
}
