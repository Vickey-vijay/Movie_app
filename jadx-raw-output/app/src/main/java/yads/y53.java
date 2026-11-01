package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class y53 extends v21 {
    public static final Parcelable.Creator<y53> CREATOR = new x53();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f84828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f84829d;

    public y53(Parcel parcel) {
        super((String) ib3.a((Object) parcel.readString()));
        this.f84828c = parcel.readString();
        this.f84829d = (String) ib3.a((Object) parcel.readString());
    }

    public static ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y53.class != obj.getClass()) {
            return false;
        }
        y53 y53Var = (y53) obj;
        return ib3.a(this.f83729b, y53Var.f83729b) && ib3.a(this.f84828c, y53Var.f84828c) && ib3.a(this.f84829d, y53Var.f84829d);
    }

    public final int hashCode() {
        int iA = k4.a(this.f83729b, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31);
        String str = this.f84828c;
        int iHashCode = (iA + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f84829d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // yads.v21
    public final String toString() {
        return this.f83729b + ": description=" + this.f84828c + ": value=" + this.f84829d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f83729b);
        parcel.writeString(this.f84828c);
        parcel.writeString(this.f84829d);
    }

    public y53(String str, String str2, String str3) {
        super(str);
        this.f84828c = str2;
        this.f84829d = str3;
    }

    @Override // yads.ss1
    public final void a(im1 im1Var) {
        byte b10;
        String str = this.f83729b;
        str.getClass();
        switch (str) {
            case "TAL":
                b10 = 0;
                break;
            case "TCM":
                b10 = 1;
                break;
            case "TDA":
                b10 = 2;
                break;
            case "TP1":
                b10 = 3;
                break;
            case "TP2":
                b10 = 4;
                break;
            case "TP3":
                b10 = 5;
                break;
            case "TRK":
                b10 = 6;
                break;
            case "TT2":
                b10 = 7;
                break;
            case "TXT":
                b10 = 8;
                break;
            case "TYE":
                b10 = 9;
                break;
            case "TALB":
                b10 = 10;
                break;
            case "TCOM":
                b10 = 11;
                break;
            case "TDAT":
                b10 = 12;
                break;
            case "TDRC":
                b10 = 13;
                break;
            case "TDRL":
                b10 = 14;
                break;
            case "TEXT":
                b10 = 15;
                break;
            case "TIT2":
                b10 = 16;
                break;
            case "TPE1":
                b10 = 17;
                break;
            case "TPE2":
                b10 = 18;
                break;
            case "TPE3":
                b10 = 19;
                break;
            case "TRCK":
                b10 = 20;
                break;
            case "TYER":
                b10 = 21;
                break;
            default:
                b10 = -1;
                break;
        }
        try {
            switch (b10) {
                case 0:
                case 10:
                    im1Var.f78700c = this.f84829d;
                    break;
                case 1:
                case 11:
                    im1Var.f78721x = this.f84829d;
                    break;
                case 2:
                case 12:
                    int i10 = Integer.parseInt(this.f84829d.substring(2, 4));
                    int i11 = Integer.parseInt(this.f84829d.substring(0, 2));
                    im1Var.f78715r = Integer.valueOf(i10);
                    im1Var.f78716s = Integer.valueOf(i11);
                    break;
                case 3:
                case 17:
                    im1Var.f78699b = this.f84829d;
                    break;
                case 4:
                case 18:
                    im1Var.f78701d = this.f84829d;
                    break;
                case 5:
                case 19:
                    im1Var.f78722y = this.f84829d;
                    break;
                case 6:
                case 20:
                    String str2 = this.f84829d;
                    int i12 = ib3.f78556a;
                    String[] strArrSplit = str2.split("/", -1);
                    int i13 = Integer.parseInt(strArrSplit[0]);
                    Integer numValueOf = strArrSplit.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit[1])) : null;
                    im1Var.f78710m = Integer.valueOf(i13);
                    im1Var.f78711n = numValueOf;
                    break;
                case 7:
                case 16:
                    im1Var.f78698a = this.f84829d;
                    break;
                case 8:
                case 15:
                    im1Var.f78720w = this.f84829d;
                    break;
                case 9:
                case 21:
                    im1Var.f78714q = Integer.valueOf(Integer.parseInt(this.f84829d));
                    break;
                case 13:
                    ArrayList arrayListA = a(this.f84829d);
                    int size = arrayListA.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                im1Var.f78716s = (Integer) arrayListA.get(2);
                            }
                        }
                        im1Var.f78715r = (Integer) arrayListA.get(1);
                    }
                    im1Var.f78714q = (Integer) arrayListA.get(0);
                    break;
                case 14:
                    ArrayList arrayListA2 = a(this.f84829d);
                    int size2 = arrayListA2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                im1Var.f78719v = (Integer) arrayListA2.get(2);
                            }
                        }
                        im1Var.f78718u = (Integer) arrayListA2.get(1);
                    }
                    im1Var.f78717t = (Integer) arrayListA2.get(0);
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }
}
