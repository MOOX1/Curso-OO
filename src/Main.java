import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(0);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso javascript");
        curso2.setDescricao("Descrição curso javascript");
        curso2.setCargaHoraria(0);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo(" Mentoria  do Curso ");
        mentoria.setDescricao(" Descrição do Curso ");
        mentoria.setData(LocalDate.now());

       /* System.out.println(curso1.toString());
        System.out.println( curso2.toString());
        System.out.println(mentoria.toString());*/

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("Java Develper");
        bootCamp.setDescricao("não perca");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        Dev devVitor = new Dev();
        devVitor.setNome("Vitor");
        devVitor.inscreverBootCamp(bootCamp);

        System.out.println("conteudos inscritos " + devVitor.getConteudosInscritos());

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootCamp(bootCamp);

        System.out.println("conteudos inscritos " + devPedro.getConteudosInscritos());


    }
}
