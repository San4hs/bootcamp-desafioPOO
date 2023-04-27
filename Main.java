import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("java");
        curso1.setDescricao("curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("js");
        curso2.setDescricao("curso js");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria em java");
        mentoria.setDescricao("mentoria em java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setTitulo("bootcamp em java dev");
        bootcamp.setDescricao("bootcamp em java dev");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDuda = new Dev();
        devDuda.setNome("dev duda");
        dev.Duda.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Incritos" + devDuda.getConteudosIncritos());
        devDuda.progredir();
        devDuda.progredir();
        System.out.println("Conteudos Concluidos" + devDuda.getConteudosConcluidos());
        System.out.println("XP: " + devSana.calcularTotalXp());
        System.out.println("---------");

        Dev devSana = new Dev();
        devSana.setNome("dev sana");
        devSana.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Incritos" + devSana.getConteudosIncritos());
        devSana.progredir();
        devSana.progredir();
        devSana.progredir();
        System.out.println("-");
        System.out.println("Conteudos Concluidos" + devSana.getConteudosConcluidos());
        System.out.println("XP: " + devSana.calcularTotalXp());

    }
}