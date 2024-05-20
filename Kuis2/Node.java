public class Node {
    public String klub;
    public int Team;
    public int menang;
    public int seri;
    public int kalah;
    public int poin;
    public int golMasuk;
    public int golKebobolan;
    public int selisihGol;
    public Node next;
    public Node prev;

    public Node(String klub, int Team, int menang, int seri, int kalah, int golMasuk, int golKebobolan) {
        this.klub = klub;
        this.Team = Team;
        this.menang = menang;
        this.seri = seri;
        this.kalah = kalah;
        this.poin = menang * 3 + seri;  // Calculate points based on wins, draws, and losses
        this.golMasuk = golMasuk;
        this.golKebobolan = golKebobolan;
        this.selisihGol = golMasuk - golKebobolan;
        this.next = null;
        this.prev = null;
        }
    }