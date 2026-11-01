package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import ck.p;
import com.facebook.internal.k0;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import kotlin.Metadata;
import lk.c;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: AuthenticationTokenHeader.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u0000 \u00112\u00020\u0001:\u0001\u0015B\u0011\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\t¢\u0006\u0004\b\u001f\u0010 B\u0011\b\u0010\u0012\u0006\u0010!\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010\"B\u0011\b\u0010\u0012\u0006\u0010#\u001a\u00020\u0010¢\u0006\u0004\b\u001f\u0010$J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0004H\u0016J\u000f\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\tH\u0002R\u0017\u0010\u0019\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001c\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u0017\u0010\u001d\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018¨\u0006%"}, d2 = {"Lcom/facebook/AuthenticationTokenHeader;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "dest", "", "flags", "Lmj/r;", "writeToParcel", "describeContents", "", "toString", "", "other", "", "equals", "hashCode", "Lorg/json/JSONObject;", "e", "()Lorg/json/JSONObject;", "headerString", "d", "b", "Ljava/lang/String;", "getAlg", "()Ljava/lang/String;", "alg", "c", "getTyp", ImpressionLog.F, "kid", "encodedHeaderString", "<init>", "(Ljava/lang/String;)V", "parcel", "(Landroid/os/Parcel;)V", "jsonObject", "(Lorg/json/JSONObject;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class AuthenticationTokenHeader implements Parcelable {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final String alg;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final String typ;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final String kid;
    public static final Parcelable.Creator<AuthenticationTokenHeader> CREATOR = new a();

    /* JADX INFO: compiled from: AuthenticationTokenHeader.kt */
    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/facebook/AuthenticationTokenHeader$a", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/AuthenticationTokenHeader;", "Landroid/os/Parcel;", "source", "a", "", "size", "", "b", "(I)[Lcom/facebook/AuthenticationTokenHeader;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class a implements Parcelable.Creator<AuthenticationTokenHeader> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AuthenticationTokenHeader createFromParcel(Parcel source) {
            p.j(source, "source");
            return new AuthenticationTokenHeader(source);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AuthenticationTokenHeader[] newArray(int size) {
            return new AuthenticationTokenHeader[size];
        }
    }

    public AuthenticationTokenHeader(String str) throws JSONException {
        p.j(str, "encodedHeaderString");
        if (!d(str)) {
            throw new IllegalArgumentException("Invalid Header".toString());
        }
        byte[] bArrDecode = Base64.decode(str, 0);
        p.i(bArrDecode, "decodedBytes");
        JSONObject jSONObject = new JSONObject(new String(bArrDecode, c.f63591b));
        String string = jSONObject.getString("alg");
        p.i(string, "jsonObj.getString(\"alg\")");
        this.alg = string;
        String string2 = jSONObject.getString(ImpressionLog.F);
        p.i(string2, "jsonObj.getString(\"typ\")");
        this.typ = string2;
        String string3 = jSONObject.getString("kid");
        p.i(string3, "jsonObj.getString(\"kid\")");
        this.kid = string3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthenticationTokenHeader)) {
            return false;
        }
        AuthenticationTokenHeader authenticationTokenHeader = (AuthenticationTokenHeader) other;
        return p.e(this.alg, authenticationTokenHeader.alg) && p.e(this.typ, authenticationTokenHeader.typ) && p.e(this.kid, authenticationTokenHeader.kid);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getKid() {
        return this.kid;
    }

    public final boolean d(String headerString) {
        k0.h(headerString, "encodedHeaderString");
        byte[] bArrDecode = Base64.decode(headerString, 0);
        p.i(bArrDecode, "decodedBytes");
        try {
            JSONObject jSONObject = new JSONObject(new String(bArrDecode, c.f63591b));
            String strOptString = jSONObject.optString("alg");
            p.i(strOptString, "alg");
            boolean z10 = (strOptString.length() > 0) && p.e(strOptString, "RS256");
            String strOptString2 = jSONObject.optString("kid");
            p.i(strOptString2, "jsonObj.optString(\"kid\")");
            boolean z11 = strOptString2.length() > 0;
            String strOptString3 = jSONObject.optString(ImpressionLog.F);
            p.i(strOptString3, "jsonObj.optString(\"typ\")");
            return z10 && z11 && (strOptString3.length() > 0);
        } catch (JSONException unused) {
            return false;
        }
    }

    public final JSONObject e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("alg", this.alg);
        jSONObject.put(ImpressionLog.F, this.typ);
        jSONObject.put("kid", this.kid);
        return jSONObject;
    }

    public int hashCode() {
        return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.alg.hashCode()) * 31) + this.typ.hashCode()) * 31) + this.kid.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.j(parcel, "dest");
        parcel.writeString(this.alg);
        parcel.writeString(this.typ);
        parcel.writeString(this.kid);
    }

    public String toString() {
        String string = e().toString();
        p.i(string, "headerJsonObject.toString()");
        return string;
    }

    public AuthenticationTokenHeader(Parcel parcel) {
        p.j(parcel, "parcel");
        this.alg = k0.l(parcel.readString(), "alg");
        this.typ = k0.l(parcel.readString(), ImpressionLog.F);
        this.kid = k0.l(parcel.readString(), "kid");
    }

    public AuthenticationTokenHeader(JSONObject jSONObject) throws JSONException {
        p.j(jSONObject, "jsonObject");
        String string = jSONObject.getString("alg");
        p.i(string, "jsonObject.getString(\"alg\")");
        this.alg = string;
        String string2 = jSONObject.getString(ImpressionLog.F);
        p.i(string2, "jsonObject.getString(\"typ\")");
        this.typ = string2;
        String string3 = jSONObject.getString("kid");
        p.i(string3, "jsonObject.getString(\"kid\")");
        this.kid = string3;
    }
}
