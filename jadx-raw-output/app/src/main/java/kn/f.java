package kn;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.logging.Logger;
import org.fourthline.cling.binding.xml.Descriptor$Service$ATTRIBUTE;
import org.fourthline.cling.binding.xml.Descriptor$Service$ELEMENT;
import org.fourthline.cling.binding.xml.DescriptorBindingException;
import org.fourthline.cling.model.ValidationException;
import org.fourthline.cling.model.meta.ActionArgument;
import org.fourthline.cling.model.types.Datatype;
import org.seamless.xml.SAXParser;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import un.l;
import un.o;

/* JADX INFO: compiled from: UDA10ServiceDescriptorBinderSAXImpl.java */
/* JADX INFO: loaded from: classes7.dex */
public class f extends kn.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Logger f62951b = Logger.getLogger(kn.c.class.getName());

    /* JADX INFO: compiled from: UDA10ServiceDescriptorBinderSAXImpl.java */
    public static class b extends i<jn.b> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final Descriptor$Service$ELEMENT f62953f = Descriptor$Service$ELEMENT.argument;

        @Override // kn.f.i
        public void f(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT) throws SAXException {
            int i10 = a.f62952a[descriptor$Service$ELEMENT.ordinal()];
            if (i10 == 1) {
                b().f61949a = a();
                return;
            }
            if (i10 != 2) {
                if (i10 == 3) {
                    b().f61950b = a();
                    return;
                } else {
                    if (i10 != 4) {
                        return;
                    }
                    b().f61952d = true;
                    return;
                }
            }
            String strA = a();
            try {
                b().f61951c = ActionArgument.Direction.valueOf(strA.toUpperCase(Locale.ROOT));
            } catch (IllegalArgumentException unused) {
                f.f62951b.warning("UPnP specification violation: Invalid action argument direction, assuming 'IN': " + strA);
                b().f61951c = ActionArgument.Direction.IN;
            }
        }

        @Override // kn.f.i
        public boolean g(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT) {
            return descriptor$Service$ELEMENT.equals(f62953f);
        }

        public b(jn.b bVar, i iVar) {
            super(bVar, iVar);
        }
    }

    /* JADX INFO: compiled from: UDA10ServiceDescriptorBinderSAXImpl.java */
    public static class c extends i<List<jn.b>> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final Descriptor$Service$ELEMENT f62954f = Descriptor$Service$ELEMENT.argumentList;

        @Override // kn.f.i
        public boolean g(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT) {
            return descriptor$Service$ELEMENT.equals(f62954f);
        }

        @Override // kn.f.i
        public void h(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT, Attributes attributes) throws SAXException {
            if (descriptor$Service$ELEMENT.equals(b.f62953f)) {
                jn.b bVar = new jn.b();
                b().add(bVar);
                new b(bVar, this);
            }
        }

        public c(List<jn.b> list, i iVar) {
            super(list, iVar);
        }
    }

    /* JADX INFO: compiled from: UDA10ServiceDescriptorBinderSAXImpl.java */
    public static class d extends i<jn.a> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final Descriptor$Service$ELEMENT f62955f = Descriptor$Service$ELEMENT.action;

        @Override // kn.f.i
        public void f(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT) throws SAXException {
            if (a.f62952a[descriptor$Service$ELEMENT.ordinal()] != 1) {
                return;
            }
            b().f61947a = a();
        }

        @Override // kn.f.i
        public boolean g(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT) {
            return descriptor$Service$ELEMENT.equals(f62955f);
        }

        @Override // kn.f.i
        public void h(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT, Attributes attributes) throws SAXException {
            if (descriptor$Service$ELEMENT.equals(c.f62954f)) {
                ArrayList arrayList = new ArrayList();
                b().f61948b = arrayList;
                new c(arrayList, this);
            }
        }

        public d(jn.a aVar, i iVar) {
            super(aVar, iVar);
        }
    }

    /* JADX INFO: compiled from: UDA10ServiceDescriptorBinderSAXImpl.java */
    public static class e extends i<List<jn.a>> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final Descriptor$Service$ELEMENT f62956f = Descriptor$Service$ELEMENT.actionList;

        @Override // kn.f.i
        public boolean g(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT) {
            return descriptor$Service$ELEMENT.equals(f62956f);
        }

        @Override // kn.f.i
        public void h(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT, Attributes attributes) throws SAXException {
            if (descriptor$Service$ELEMENT.equals(d.f62955f)) {
                jn.a aVar = new jn.a();
                b().add(aVar);
                new d(aVar, this);
            }
        }

        public e(List<jn.a> list, i iVar) {
            super(list, iVar);
        }
    }

    /* JADX INFO: renamed from: kn.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: UDA10ServiceDescriptorBinderSAXImpl.java */
    public static class C0562f extends i<List<String>> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final Descriptor$Service$ELEMENT f62957f = Descriptor$Service$ELEMENT.allowedValueList;

        @Override // kn.f.i
        public void f(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT) throws SAXException {
            if (a.f62952a[descriptor$Service$ELEMENT.ordinal()] != 7) {
                return;
            }
            b().add(a());
        }

        @Override // kn.f.i
        public boolean g(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT) {
            return descriptor$Service$ELEMENT.equals(f62957f);
        }

        public C0562f(List<String> list, i iVar) {
            super(list, iVar);
        }
    }

    /* JADX INFO: compiled from: UDA10ServiceDescriptorBinderSAXImpl.java */
    public static class g extends i<jn.c> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final Descriptor$Service$ELEMENT f62958f = Descriptor$Service$ELEMENT.allowedValueRange;

        @Override // kn.f.i
        public void f(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT) throws SAXException {
            try {
                switch (a.f62952a[descriptor$Service$ELEMENT.ordinal()]) {
                    case 8:
                        b().f61953a = Long.valueOf(a());
                        break;
                    case 9:
                        b().f61954b = Long.valueOf(a());
                        break;
                    case 10:
                        b().f61955c = Long.valueOf(a());
                        break;
                }
            } catch (Exception unused) {
            }
        }

        @Override // kn.f.i
        public boolean g(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT) {
            return descriptor$Service$ELEMENT.equals(f62958f);
        }

        public g(jn.c cVar, i iVar) {
            super(cVar, iVar);
        }
    }

    /* JADX INFO: compiled from: UDA10ServiceDescriptorBinderSAXImpl.java */
    public static class h extends i<jn.f> {
        @Override // kn.f.i
        public void h(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT, Attributes attributes) throws SAXException {
            if (descriptor$Service$ELEMENT.equals(e.f62956f)) {
                ArrayList arrayList = new ArrayList();
                b().f61986f = arrayList;
                new e(arrayList, this);
            }
            if (descriptor$Service$ELEMENT.equals(k.f62960f)) {
                ArrayList arrayList2 = new ArrayList();
                b().f61987g = arrayList2;
                new k(arrayList2, this);
            }
        }

        public h(jn.f fVar, SAXParser sAXParser) {
            super(fVar, sAXParser);
        }
    }

    /* JADX INFO: compiled from: UDA10ServiceDescriptorBinderSAXImpl.java */
    public static class i<I> extends SAXParser.a<I> {
        public i(I i10, SAXParser sAXParser) {
            super(i10, sAXParser);
        }

        public void f(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT) throws SAXException {
        }

        public boolean g(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT) {
            return false;
        }

        public void h(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT, Attributes attributes) throws SAXException {
        }

        public i(I i10, i iVar) {
            super(i10, iVar);
        }

        @Override // org.seamless.xml.SAXParser.a
        public boolean d(String str, String str2, String str3) {
            Descriptor$Service$ELEMENT descriptor$Service$ELEMENTValueOrNullOf = Descriptor$Service$ELEMENT.valueOrNullOf(str2);
            if (descriptor$Service$ELEMENTValueOrNullOf != null && g(descriptor$Service$ELEMENTValueOrNullOf)) {
                return true;
            }
            return false;
        }

        @Override // org.seamless.xml.SAXParser.a, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) throws SAXException {
            super.endElement(str, str2, str3);
            Descriptor$Service$ELEMENT descriptor$Service$ELEMENTValueOrNullOf = Descriptor$Service$ELEMENT.valueOrNullOf(str2);
            if (descriptor$Service$ELEMENTValueOrNullOf == null) {
                return;
            }
            f(descriptor$Service$ELEMENTValueOrNullOf);
        }

        @Override // org.seamless.xml.SAXParser.a, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
            super.startElement(str, str2, str3, attributes);
            Descriptor$Service$ELEMENT descriptor$Service$ELEMENTValueOrNullOf = Descriptor$Service$ELEMENT.valueOrNullOf(str2);
            if (descriptor$Service$ELEMENTValueOrNullOf == null) {
                return;
            }
            h(descriptor$Service$ELEMENTValueOrNullOf, attributes);
        }
    }

    /* JADX INFO: compiled from: UDA10ServiceDescriptorBinderSAXImpl.java */
    public static class j extends i<jn.g> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final Descriptor$Service$ELEMENT f62959f = Descriptor$Service$ELEMENT.stateVariable;

        @Override // kn.f.i
        public void f(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT) throws SAXException {
            int i10 = a.f62952a[descriptor$Service$ELEMENT.ordinal()];
            if (i10 == 1) {
                b().f61988a = a();
                return;
            }
            if (i10 != 5) {
                if (i10 != 6) {
                    return;
                }
                b().f61990c = a();
            } else {
                String strA = a();
                Datatype.Builtin byDescriptorName = Datatype.Builtin.getByDescriptorName(strA);
                b().f61989b = byDescriptorName != null ? byDescriptorName.getDatatype() : new yn.f(strA);
            }
        }

        @Override // kn.f.i
        public boolean g(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT) {
            return descriptor$Service$ELEMENT.equals(f62959f);
        }

        @Override // kn.f.i
        public void h(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT, Attributes attributes) throws SAXException {
            if (descriptor$Service$ELEMENT.equals(C0562f.f62957f)) {
                ArrayList arrayList = new ArrayList();
                b().f61991d = arrayList;
                new C0562f(arrayList, this);
            }
            if (descriptor$Service$ELEMENT.equals(g.f62958f)) {
                jn.c cVar = new jn.c();
                b().f61992e = cVar;
                new g(cVar, this);
            }
        }

        public j(jn.g gVar, i iVar) {
            super(gVar, iVar);
        }
    }

    /* JADX INFO: compiled from: UDA10ServiceDescriptorBinderSAXImpl.java */
    public static class k extends i<List<jn.g>> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final Descriptor$Service$ELEMENT f62960f = Descriptor$Service$ELEMENT.serviceStateTable;

        @Override // kn.f.i
        public boolean g(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT) {
            return descriptor$Service$ELEMENT.equals(f62960f);
        }

        @Override // kn.f.i
        public void h(Descriptor$Service$ELEMENT descriptor$Service$ELEMENT, Attributes attributes) throws SAXException {
            if (descriptor$Service$ELEMENT.equals(j.f62959f)) {
                jn.g gVar = new jn.g();
                String value = attributes.getValue(Descriptor$Service$ATTRIBUTE.sendEvents.toString());
                gVar.f61993f = new o(value != null && value.toUpperCase(Locale.ROOT).equals("YES"));
                b().add(gVar);
                new j(gVar, this);
            }
        }

        public k(List<jn.g> list, i iVar) {
            super(list, iVar);
        }
    }

    /* JADX INFO: compiled from: UDA10ServiceDescriptorBinderSAXImpl.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f62952a;

        static {
            int[] iArr = new int[Descriptor$Service$ELEMENT.values().length];
            f62952a = iArr;
            try {
                iArr[Descriptor$Service$ELEMENT.name.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f62952a[Descriptor$Service$ELEMENT.direction.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f62952a[Descriptor$Service$ELEMENT.relatedStateVariable.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f62952a[Descriptor$Service$ELEMENT.retval.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f62952a[Descriptor$Service$ELEMENT.dataType.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f62952a[Descriptor$Service$ELEMENT.defaultValue.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f62952a[Descriptor$Service$ELEMENT.allowedValue.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f62952a[Descriptor$Service$ELEMENT.minimum.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f62952a[Descriptor$Service$ELEMENT.maximum.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f62952a[Descriptor$Service$ELEMENT.step.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    @Override // kn.e, kn.c
    public <S extends l> S b(S s10, String str) throws ValidationException, DescriptorBindingException {
        if (str == null || str.length() == 0) {
            throw new DescriptorBindingException("Null or empty descriptor");
        }
        try {
            f62951b.fine("Reading service from XML descriptor");
            SAXParser sAXParser = new SAXParser();
            jn.f fVar = new jn.f();
            p(fVar, s10);
            new h(fVar, sAXParser);
            sAXParser.f(new InputSource(new StringReader(str.trim())));
            return (S) fVar.a(s10.d());
        } catch (ValidationException e10) {
            throw e10;
        } catch (Exception e11) {
            throw new DescriptorBindingException("Could not parse service descriptor: " + e11.toString(), e11);
        }
    }
}
