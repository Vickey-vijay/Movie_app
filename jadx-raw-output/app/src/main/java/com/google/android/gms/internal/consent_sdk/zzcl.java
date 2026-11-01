package com.google.android.gms.internal.consent_sdk;

import android.util.JsonReader;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.2.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzcl {

    @Nullable
    public String zza;

    @Nullable
    public String zzb;

    @Nullable
    public String zzc;
    public int zzf = 1;
    public List zzd = Collections.emptyList();
    public List zze = Collections.emptyList();
    public int zzg = 1;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:48:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:75:0x0105  */
    /* JADX WARN: Code duplicated, block: B:96:0x014b  */
    public static zzcl zza(JsonReader jsonReader) throws IOException {
        byte b10;
        byte b11;
        int i10;
        zzcl zzclVar = new zzcl();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int i11 = 4;
            int i12 = 3;
            switch (jsonReader.nextName()) {
                case "consent_signal":
                    String strNextString = jsonReader.nextString();
                    switch (strNextString) {
                        case "CONSENT_SIGNAL_UNKNOWN":
                            i11 = 1;
                            zzclVar.zzf = i11;
                            break;
                        case "CONSENT_SIGNAL_PERSONALIZED_ADS":
                            i11 = 2;
                            zzclVar.zzf = i11;
                            break;
                        case "CONSENT_SIGNAL_NON_PERSONALIZED_ADS":
                            i11 = 3;
                            zzclVar.zzf = i11;
                            break;
                        case "CONSENT_SIGNAL_SUFFICIENT":
                            zzclVar.zzf = i11;
                            break;
                        case "CONSENT_SIGNAL_COLLECT_CONSENT":
                            i11 = 5;
                            zzclVar.zzf = i11;
                            break;
                        case "CONSENT_SIGNAL_NOT_REQUIRED":
                            i11 = 6;
                            zzclVar.zzf = i11;
                            break;
                        case "CONSENT_SIGNAL_ERROR":
                            i11 = 7;
                            zzclVar.zzf = i11;
                            break;
                        case "CONSENT_SIGNAL_PUBLISHER_MISCONFIGURATION":
                            i11 = 8;
                            zzclVar.zzf = i11;
                            break;
                        default:
                            throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                    }
                    break;
                case "consent_form_payload":
                    zzclVar.zza = jsonReader.nextString();
                    break;
                case "consent_form_base_url":
                    zzclVar.zzb = jsonReader.nextString();
                    break;
                case "error_message":
                    zzclVar.zzc = jsonReader.nextString();
                    break;
                case "request_info_keys":
                    zzclVar.zzd = new ArrayList();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        zzclVar.zzd.add(jsonReader.nextString());
                    }
                    jsonReader.endArray();
                    break;
                case "actions":
                    zzclVar.zze = new ArrayList();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        zzck zzckVar = new zzck();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String strNextName = jsonReader.nextName();
                            int iHashCode = strNextName.hashCode();
                            if (iHashCode != -2105551094) {
                                if (iHashCode == 1583758243 && strNextName.equals("action_type")) {
                                    b10 = 0;
                                } else {
                                    b10 = -1;
                                }
                            } else if (strNextName.equals("args_json")) {
                                b10 = 1;
                            } else {
                                b10 = -1;
                            }
                            if (b10 == 0) {
                                String strNextString2 = jsonReader.nextString();
                                int iHashCode2 = strNextString2.hashCode();
                                if (iHashCode2 != 64208429) {
                                    if (iHashCode2 != 82862015) {
                                        if (iHashCode2 == 1856333582 && strNextString2.equals("UNKNOWN_ACTION_TYPE")) {
                                            b11 = 0;
                                        } else {
                                            b11 = -1;
                                        }
                                    } else if (strNextString2.equals("WRITE")) {
                                        b11 = 1;
                                    } else {
                                        b11 = -1;
                                    }
                                } else if (strNextString2.equals("CLEAR")) {
                                    b11 = 2;
                                } else {
                                    b11 = -1;
                                }
                                if (b11 == 0) {
                                    i10 = 1;
                                } else if (b11 == 1) {
                                    i10 = 2;
                                } else {
                                    if (b11 != 2) {
                                        throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(strNextString2));
                                    }
                                    i10 = 3;
                                }
                                zzckVar.zzb = i10;
                            } else if (b10 != 1) {
                                jsonReader.skipValue();
                            } else {
                                zzckVar.zza = jsonReader.nextString();
                            }
                        }
                        jsonReader.endObject();
                        zzclVar.zze.add(zzckVar);
                    }
                    jsonReader.endArray();
                    break;
                case "privacy_options_required":
                    String strNextString3 = jsonReader.nextString();
                    int iHashCode3 = strNextString3.hashCode();
                    if (iHashCode3 != -1888946261) {
                        if (iHashCode3 != 389487519) {
                            if (iHashCode3 != 433141802 || !strNextString3.equals("UNKNOWN")) {
                            }
                        } else if (strNextString3.equals("REQUIRED")) {
                        }
                    } else if (strNextString3.equals("NOT_REQUIRED")) {
                    }
                    if (r7 == 0) {
                        i12 = 1;
                    } else if (r7 == 1) {
                        i12 = 2;
                    } else if (r7 != 2) {
                        throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.PrivacyOptionsRequirementStatusfrom: ".concat(strNextString3));
                    }
                    zzclVar.zzg = i12;
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return zzclVar;
    }
}
