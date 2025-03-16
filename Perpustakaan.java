class Perpustakaan {
    public String kategori;
    public String judulBuku;
    public String penulis;
    public String sinopsis;

    public Perpustakaan (String kategori, String judulBuku, String penulis, String sinopsis) {
        this.kategori = kategori;
        this.judulBuku = judulBuku;
        this.penulis = penulis;
        this.sinopsis = sinopsis;
    }

    public int hitungJumlahKata() {
        if (sinopsis == null || sinopsis.trim().isEmpty()) {
            return 0;
        }
        return sinopsis.trim().split("\\s+").length;
    }

    public double cekTingkatKesamaan(Perpustakaan objLain) {
        int totalFields = 4;
        int matches = 0;

        if (this.kategori.equals(objLain.kategori)) matches++;
        if (this.judulBuku.equals(objLain.judulBuku)) matches++;
        if (this.penulis.equals(objLain.penulis)) matches++;
        if (this.sinopsis.equals(objLain.sinopsis)) matches++;

        return (matches / (double) totalFields) * 100;
    }

    public Perpustakaan copy() {
        return new Perpustakaan(this.kategori, this.judulBuku, this.penulis, this.sinopsis);
    }

    public void printOut() {
        System.out.println("Kategori buku: " + kategori);
        System.out.println("Judul buku: " + judulBuku);
        System.out.println("Penulis: " + penulis);
        System.out.println("Sinopsis: " + sinopsis);
        System.out.println("Jumlah kata pada sinopsis: " + hitungJumlahKata());
    }

    public void baca() {
        System.out.println("Buku \"" + judulBuku + "\" sedang dibaca.\n");
    }

    public void simpan() {
        System.out.println("Buku \"" + judulBuku + "\" sedang disimpan.\n");
    }

    public void pinjam() {
        System.out.println("Buku \"" + judulBuku + "\" sedang dipinjam.\n");
    }
}

class PerpustakaanMain {
    public static void main(String[] args) {
        Perpustakaan buku1 = new Perpustakaan("Teknologi", "Buku Teknologi 1", "Penulis A", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. In quam tortor, pharetra vitae faucibus quis, tempus non lectus.");
        buku1.printOut();
        buku1.baca();

        Perpustakaan buku2 = new Perpustakaan("Teknologi", "Buku Teknologi 2", "Penulis B", "Mauris et nunc iaculis, fermentum eros non, placerat enim. Sed massa metus, ornare at eros quis, placerat ullamcorper diam.");
        buku2.printOut();
        System.out.println("Tingkat kesamaan: " + buku1.cekTingkatKesamaan(buku2) + "%");
        buku2.baca();
		
		Perpustakaan buku3 = new Perpustakaan("Teknologi", "Buku Teknologi 3", "Penulis C, Penulis D", "Morbi consectetur, ligula eget pulvinar tincidunt, est ligula ultricies purus, in ultricies nunc turpis vel nunc.");
        buku3.printOut();
        System.out.println("Tingkat kesamaan: " + buku2.cekTingkatKesamaan(buku3) + "%");
        buku3.pinjam();
		
		Perpustakaan buku4 = new Perpustakaan("Teknologi", "Buku Teknologi 4", "Penulis E", "Vestibulum feugiat dui in quam feugiat, at aliquet odio mattis. Vivamus at scelerisque enim.");
        buku4.printOut();
        System.out.println("Tingkat kesamaan: " + buku3.cekTingkatKesamaan(buku4) + "%");
        buku4.baca();
		
		Perpustakaan buku5 = new Perpustakaan("Teknologi", "Buku Teknologi 5", "Penulis F","Mauris pharetra non ante sed pretium. Integer aliquet mauris vel orci elementum, et gravida dui pulvinar.");
        buku5.printOut();
        System.out.println("Tingkat kesamaan: " + buku4.cekTingkatKesamaan(buku5) + "%");
        buku5.simpan();
		
		Perpustakaan buku6 = new Perpustakaan("Filsafat", "Buku Filsafat 1", "Penulis G", "Integer a mi in ligula luctus imperdiet dignissim nec mauris.");
        buku6.printOut();
        System.out.println("Tingkat kesamaan: " + buku5.cekTingkatKesamaan(buku6) + "%");
        buku6.baca();
		
		Perpustakaan buku7 = new Perpustakaan("Filsafat", "Buku Filsafat 2", "Penulis H", "Curabitur condimentum feugiat nisi, at lacinia nulla. Nunc molestie elementum lacus mollis mollis.");
        buku7.printOut();
        System.out.println("Tingkat kesamaan: " + buku6.cekTingkatKesamaan(buku7) + "%");
		buku7.simpan();
		
		Perpustakaan buku8 = new Perpustakaan("Filsafat", "Buku Filsafat 3", "Penulis I, Penulis J", "Vestibulum condimentum diam lorem, id finibus lorem posuere varius. In vehicula, mi a maximus euismod, mi risus accumsan eros, at tempor odio ut lacus.");
        buku8.printOut();
        System.out.println("Tingkat kesamaan: " + buku7.cekTingkatKesamaan(buku8) + "%");
		buku8.pinjam();
		
		Perpustakaan buku9 = new Perpustakaan("Filsafat", "Buku Filsafat 4", "Penulis K", "Morbi sit amet nulla viverra, venenatis enim ut, rutrum arcu.");
        buku9.printOut();
        System.out.println("Tingkat kesamaan: " + buku8.cekTingkatKesamaan(buku9) + "%");
		buku9.pinjam();
		
		Perpustakaan buku10 = new Perpustakaan("Filsafat", "Buku Filsafat 5", "Penulis L", "Aliquam eleifend ut mauris sed faucibus. Praesent porttitor a nisi sit amet mattis.");
        buku10.printOut();
        System.out.println("Tingkat kesamaan: " + buku9.cekTingkatKesamaan(buku10) + "%");
		buku10.baca();
		
		Perpustakaan buku11 = new Perpustakaan("Sejarah", "Buku Sejarah 1", "Penulis M", "Sed ultricies justo libero, maximus eleifend dui ultrices eget. Aliquam erat volutpat.");
        buku11.printOut();
        System.out.println("Tingkat kesamaan: " + buku10.cekTingkatKesamaan(buku11) + "%");
		buku11.pinjam();
		
		Perpustakaan buku12 = new Perpustakaan("Sejarah", "Buku Sejarah 2", "Penulis N, Penulis O", "Nam sit amet commodo libero, vel tempor turpis. Sed aliquet scelerisque justo.");
        buku12.printOut();
        System.out.println("Tingkat kesamaan: " + buku11.cekTingkatKesamaan(buku12) + "%");
		buku12.simpan();
		
		Perpustakaan buku13 = new Perpustakaan("Sejarah", "Buku Sejarah 3", "Penulis P", "Praesent nec massa sed mi interdum aliquet nec ac erat. Integer ullamcorper mollis ullamcorper.");
        buku13.printOut();
        System.out.println("Tingkat kesamaan: " + buku12.cekTingkatKesamaan(buku13) + "%");
		buku13.simpan();
		
		Perpustakaan buku14 = new Perpustakaan("Sejarah", "Buku Sejarah 4", "Penulis Q", "Proin eget nunc et metus ullamcorper bibendum quis ac mauris. Vestibulum ac vulputate sapien. ");
        buku14.printOut();
        System.out.println("Tingkat kesamaan: " + buku13.cekTingkatKesamaan(buku14) + "%");
		buku14.pinjam();
		
		Perpustakaan buku15 = new Perpustakaan("Sejarah", "Buku Sejarah 5", "Penulis R, Penulis S", "Nullam facilisis nisi urna, quis feugiat nisi pharetra vitae. Proin quis nisl ut justo suscipit sagittis.");
        buku15.printOut();
        System.out.println("Tingkat kesamaan: " + buku14.cekTingkatKesamaan(buku15) + "%");
		buku15.pinjam();
		
		Perpustakaan buku16 = new Perpustakaan("Agama", "Buku Agama 1", "Penulis T, Penulis U", "Etiam sed augue vel nulla fringilla tincidunt quis convallis sem.");
        buku16.printOut();
        System.out.println("Tingkat kesamaan: " + buku15.cekTingkatKesamaan(buku16) + "%");
		buku16.simpan();
		
		Perpustakaan buku17 = new Perpustakaan("Agama", "Buku Agama 2", "Penulis V", "Proin id semper lectus. Mauris interdum tellus sed mi pulvinar, vitae imperdiet risus pellentesque.");
        buku17.printOut();
        System.out.println("Tingkat kesamaan: " + buku16.cekTingkatKesamaan(buku17) + "%");
		buku17.baca();
		
		Perpustakaan buku18 = new Perpustakaan("Agama", "Buku Agama 3", "Penulis W, Penulis X", "Sed vehicula mauris luctus accumsan euismod. Integer volutpat lacus eu molestie tristique.");
        buku18.printOut();
        System.out.println("Tingkat kesamaan: " + buku17.cekTingkatKesamaan(buku18) + "%");
		buku18.baca();
		
		Perpustakaan buku19 = new Perpustakaan("Agama", "Buku Agama 4", "Penulis Y", "Maecenas imperdiet feugiat ipsum, nec interdum nunc consectetur at. Maecenas placerat venenatis dolor, eget tempus lacus hendrerit nec.");
        buku19.printOut();
        System.out.println("Tingkat kesamaan: " + buku18.cekTingkatKesamaan(buku19) + "%");
		buku19.simpan();
		
		Perpustakaan buku20 = new Perpustakaan("Agama", "Buku Agama 5", "Penulis Z, Penulis AA", "Phasellus sollicitudin commodo justo ac dictum. Duis varius finibus nisi id lobortis.");
        buku20.printOut();
        System.out.println("Tingkat kesamaan: " + buku19.cekTingkatKesamaan(buku20) + "%");
		buku20.pinjam();
		
		Perpustakaan buku21 = new Perpustakaan("Psikologi", "Buku Psikologi 1", "Penulis AB", "In faucibus metus vitae pulvinar bibendum. Fusce vulputate placerat blandit.");
        buku21.printOut();
        System.out.println("Tingkat kesamaan: " + buku20.cekTingkatKesamaan(buku21) + "%");
		buku21.baca();
		
		Perpustakaan buku22 = new Perpustakaan("Psikologi", "Buku Psikologi 2", "Penulis AC", "Morbi eu nisl a erat tempus mattis. Integer cursus libero neque.");
        buku22.printOut();
        System.out.println("Tingkat kesamaan: " + buku21.cekTingkatKesamaan(buku22) + "%");
		buku22.simpan();
		
		Perpustakaan buku23 = new Perpustakaan("Psikologi", "Buku Psikologi 3", "Penulis AD", "Etiam fringilla tincidunt risus, nec blandit libero ultricies non. In non dui sapien.");
        buku23.printOut();
        System.out.println("Tingkat kesamaan: " + buku22.cekTingkatKesamaan(buku23) + "%");
		buku23.pinjam();
		
		Perpustakaan buku24 = new Perpustakaan("Psikologi", "Buku Psikologi 4", "Penulis AE, Penulis AF", "Nam sed mattis est. Cras ligula orci, rutrum eu accumsan at, blandit id arcu. Nunc in vulputate dolor, quis pulvinar mi.");
        buku24.printOut();
        System.out.println("Tingkat kesamaan: " + buku23.cekTingkatKesamaan(buku24) + "%");
		buku24.baca();
		
		Perpustakaan buku25 = new Perpustakaan("Psikologi", "Buku Psikologi 5", "Penulis AG", "Aliquam luctus felis purus, ac maximus quam convallis accumsan. Nam quis feugiat lorem.");
        buku25.printOut();
        System.out.println("Tingkat kesamaan: " + buku24.cekTingkatKesamaan(buku25) + "%");
		buku25.baca();
		
		Perpustakaan buku26 = new Perpustakaan("Politik", "Buku Politik 1", "Penulis AH", "Ut magna erat, tempus laoreet enim eu, malesuada mattis elit. Sed laoreet suscipit condimentum.");
        buku26.printOut();
        System.out.println("Tingkat kesamaan: " + buku25.cekTingkatKesamaan(buku26) + "%");
		buku26.baca();
		
		Perpustakaan buku27 = new Perpustakaan("Politik", "Buku Politik 2", "Penulis AI, Penulis AJ", "Morbi hendrerit, leo et condimentum venenatis, tellus mauris mollis purus, sit amet accumsan risus lectus sed tortor.");
        buku27.printOut();
        System.out.println("Tingkat kesamaan: " + buku26.cekTingkatKesamaan(buku27) + "%");
		buku27.baca();
		
		Perpustakaan buku28 = new Perpustakaan("Politik", "Buku Politik 3", "Penulis AK, Penulis AL, Penulis AM", "Duis ac eros fermentum, rutrum massa ac, vestibulum sapien. Quisque non lorem sapien.");
        buku28.printOut();
        System.out.println("Tingkat kesamaan: " + buku27.cekTingkatKesamaan(buku28) + "%");
		buku28.baca();
		
		Perpustakaan buku29 = new Perpustakaan("Politik", "Buku Politik 4", "Penulis AN", "Nulla pretium nunc vel nibh eleifend tempus. Nam non varius nibh.");
        buku29.printOut();
        System.out.println("Tingkat kesamaan: " + buku28.cekTingkatKesamaan(buku29) + "%");
		buku29.baca();
		
		Perpustakaan buku30 = new Perpustakaan("Politik", "Buku Politik 5", "Penulis AO", "Nam enim metus, condimentum aliquam velit vel, vehicula tempor massa. Aenean varius mauris ac dapibus consequat.");
        buku30.printOut();
        System.out.println("Tingkat kesamaan: " + buku29.cekTingkatKesamaan(buku30) + "%");
		buku30.baca();
		
		Perpustakaan buku31 = new Perpustakaan("Fiksi", "Buku Fiksi 1", "Penulis AP, Penulis AQ", "Sed rutrum elementum tortor, et posuere sapien faucibus eget. Ut sed pellentesque mi.");
        buku31.printOut();
        System.out.println("Tingkat kesamaan: " + buku30.cekTingkatKesamaan(buku31) + "%");
		buku31.pinjam();
		
		Perpustakaan buku32 = new Perpustakaan("Fiksi", "Buku Fiksi 2", "Penulis AR", "Nam sed nisi tempor, congue leo in, venenatis mi. Etiam eget scelerisque tellus.");
        buku32.printOut();
        System.out.println("Tingkat kesamaan: " + buku31.cekTingkatKesamaan(buku32) + "%");
		buku32.simpan();
		
		Perpustakaan buku33 = new Perpustakaan("Fiksi", "Buku Fiksi 3", "Penulis AS", "Phasellus pulvinar sem massa, ac dignissim justo dignissim vel. Morbi quis orci iaculis velit vestibulum placerat.");
        buku33.printOut();
        System.out.println("Tingkat kesamaan: " + buku32.cekTingkatKesamaan(buku33) + "%");
		buku33.baca();
		
		Perpustakaan buku34 = new Perpustakaan("Fiksi", "Buku Fiksi 4", "Penulis AT, Penulis AU", "Maecenas eu magna porttitor, rhoncus lorem at, consectetur risus. Phasellus posuere aliquam lacus, ac porta libero mattis a.");
        buku34.printOut();
        System.out.println("Tingkat kesamaan: " + buku33.cekTingkatKesamaan(buku34) + "%");
		buku34.simpan();
		
		Perpustakaan buku35 = new Perpustakaan("Fiksi", "Buku Fiksi 5","Penulis AV", "Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos.");
        buku35.printOut();
        System.out.println("Tingkat kesamaan: " + buku34.cekTingkatKesamaan(buku35) + "%");
		buku35.pinjam();
    }
}