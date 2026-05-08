public abstract class ProcessadorArquivo {

        public final void processarArquivo() {
            abrirArquivo();
            validarArquivos();
            lerDados();
            processarDados();
            salvarArquivo();
            fecharArquivo();

        }

        protected  abstract void validarArquivos();

        protected abstract void lerDados();

        protected abstract void processarDados();

        protected void abrirArquivo() {
            System.out.println("Abrindo arquivo");
        }

        protected void salvarArquivo() {
            System.out.println("Salvando arquivo");
        }

        protected void fecharArquivo() {
            System.out.println("Fechando arquivo");
        }
}
