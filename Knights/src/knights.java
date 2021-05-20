import java.security.PublicKey;

interface Healer {
    public void healingAura(); //초당 +10
    public void holyArmor(); //뎀감 10
}

interface Sorcerer {
    public void fireArmor(); //주변적 초당 10뎀
    public void thunderBlade(); //추뎀 10
}

interface Tanker {
    public void increaseArmor(); //아머 +5
    public void increaseHp(); //+100
}

class Knight implements Tanker{
    public String name;
    public int Hp = 0;
    public int Armor = 0;

    public void increaseArmor() {
        Hp += 100;
        System.out.println(" increaseHp 시전!");
        System.out.println("\t체력이 +100 증가합니다.");
    }

    public void increaseHp() {
        Armor += 5;
        System.out.println(" increaseArmor 시전!");
        System.out.println("\t아머가 +5 증가합니다.");
    }
}

class HolyKnight extends Knight implements Healer{
    HolyKnight(String name,int Hp,int Armor){
        this.name = name;
        this.Hp = Hp;
        this.Armor = Armor;
    }

    public void increaseArmor() {
        System.out.print("[" + this.name + "]");
        super.increaseArmor();
    }

    public void increaseHp() {
        System.out.print("[" + this.name + "]");
        super.increaseHp();
    }

    public void healingAura() {
        System.out.println("[" + name + "] healingAura 시전!");
        System.out.println("\t초당 체력회복이 +10 증가합니다.");
    }

    public void holyArmor() {
        System.out.println("[" + name + "] holyArmor 시전!");
        System.out.println("\t데미지를 10 덜받습니다.");
    }
}

class MagicKnight extends Knight implements Sorcerer{
    MagicKnight(String name,int Hp,int Armor){
        this.name = name;
        this.Hp = Hp;
        this.Armor = Armor;
    }

    public void increaseArmor() {
        System.out.print("[" + this.name + "]");
        super.increaseArmor();
    }

    public void increaseHp() {
        System.out.print("[" + this.name + "]");
        super.increaseHp();
    }

    public void fireArmor() {
        System.out.println("[" + name + "] fireArmor 시전!");
        System.out.println("\t주변 적에게 초당 +10의 데미지를 줍니다.");
    }

    public void thunderBlade() {
        System.out.println("[" + name + "] thunderBlade 시전!");
        System.out.println("\t매 공격시 +10의 추가 데미지를 줍니다.");
    }
}

public class knights {
    public static void main(String[] args) {
        // 두 영웅 생성
        Knight uther = new HolyKnight("우서", 200, 10);
        Knight arthas = new MagicKnight("아서스", 150, 8);
        // 우서: 기사 버프
        uther.increaseHp();
        uther.increaseArmor();
        // 우서: 성기사 버프
        HolyKnight holyUther = (HolyKnight) uther;
        holyUther.healingAura();
        holyUther.holyArmor();
        // 아서스: 기사 버프
        arthas.increaseHp();
        arthas.increaseArmor();
        // 아서스: 마검사 버프
        MagicKnight magicArthas = (MagicKnight) arthas;
        magicArthas.fireArmor();
        magicArthas.thunderBlade();
    }
}
