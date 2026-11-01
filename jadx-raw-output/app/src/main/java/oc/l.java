package oc;

/* JADX INFO: compiled from: WebViewAdsError.java */
/* JADX INFO: loaded from: classes9.dex */
public class l implements i {
    public String _description;
    public Object[] _errorArguments;
    private Enum _errorCategory;

    public int getCode() {
        return -1;
    }

    public String getDomain() {
        return null;
    }

    public String getDescription() {
        return this._description;
    }

    public Object[] getErrorArguments() {
        return this._errorArguments;
    }

    public Enum<?> getErrorCategory() {
        return this._errorCategory;
    }

    public l(Enum<?> r10, String str, Object... objArr) {
        this._errorCategory = r10;
        this._description = str;
        this._errorArguments = objArr;
    }
}
