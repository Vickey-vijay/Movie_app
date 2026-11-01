package com.applovin.impl;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class j7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Intent f7764a = new Intent();

    public j7 a(String str, String str2) {
        boolean zIsValidString = StringUtils.isValidString(str);
        boolean zIsValidString2 = StringUtils.isValidString(str2);
        if (zIsValidString && zIsValidString2) {
            this.f7764a.setDataAndType(Uri.parse(str), str2);
        } else if (zIsValidString) {
            this.f7764a.setData(Uri.parse(str));
        } else if (zIsValidString2) {
            this.f7764a.setType(str2);
        }
        return this;
    }

    public j7 b(String str) {
        if (StringUtils.isValidString(str)) {
            this.f7764a.addFlags(Integer.parseInt(str));
        }
        return this;
    }

    public Intent c(String str) {
        Intent intentCreateChooser = Intent.createChooser(this.f7764a, StringUtils.emptyIfNull(str));
        intentCreateChooser.addFlags(this.f7764a.getFlags());
        return intentCreateChooser;
    }

    public j7 b(String str, String str2, String str3) {
        if (StringUtils.isValidString(str)) {
            ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
            if (componentNameUnflattenFromString != null) {
                this.f7764a.setComponent(componentNameUnflattenFromString);
            }
        } else if (StringUtils.isValidString(str2) && StringUtils.isValidString(str3)) {
            this.f7764a.setClassName(str3, str2);
        } else if (StringUtils.isValidString(str3)) {
            this.f7764a.setPackage(str3);
        }
        return this;
    }

    public j7 d(String str) {
        if (StringUtils.isValidString(str)) {
            this.f7764a.setAction(str);
        }
        return this;
    }

    public j7 e(String str) {
        if (StringUtils.isValidString(str)) {
            this.f7764a.putExtras(JsonUtils.toBundle(JsonUtils.jsonObjectFromJsonString(str, new JSONObject())));
        }
        return this;
    }

    public j7 f(String str) {
        if (StringUtils.isValidString(str) && o0.i()) {
            this.f7764a.setIdentifier(str);
        }
        return this;
    }

    public j7 g(String str) {
        if (StringUtils.isValidString(str)) {
            this.f7764a.setSelector(new Intent(str));
        }
        return this;
    }

    public j7 h(String str) {
        if (StringUtils.isValidString(str)) {
            String[] strArrSplit = str.split(io.appmetrica.analytics.coreutils.internal.StringUtils.COMMA);
            if (strArrSplit.length == 4) {
                this.f7764a.setSourceBounds(new Rect(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]), Integer.parseInt(strArrSplit[3])));
            }
        }
        return this;
    }

    public j7 a(String str) {
        if (StringUtils.isValidString(str)) {
            for (String str2 : str.split(io.appmetrica.analytics.coreutils.internal.StringUtils.COMMA)) {
                this.f7764a.addCategory(str2);
            }
        }
        return this;
    }

    public j7 a(String str, String str2, String str3) {
        ClipData clipDataNewRawUri;
        if (StringUtils.isValidString(str)) {
            Uri uri = Uri.parse(str);
            if (StringUtils.isValidString(str2)) {
                clipDataNewRawUri = new ClipData(new ClipDescription(StringUtils.emptyIfNull(str3), new String[]{str2}), new ClipData.Item(uri));
            } else {
                clipDataNewRawUri = ClipData.newRawUri(StringUtils.emptyIfNull(str3), uri);
            }
            this.f7764a.setClipData(clipDataNewRawUri);
        }
        return this;
    }

    public Intent a() {
        return this.f7764a;
    }
}
