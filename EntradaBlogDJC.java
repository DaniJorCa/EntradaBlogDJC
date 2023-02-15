
    /**
     * Clase para manejar las entradas de un blog.
     * @author Dani Jordan Carreño
     * @version 2.3.1
     * @since 21/03/1999
     */
    public class EntradaBlogDJC {
        /**
         * @param separador : separa 'ENTRADA DE' de autor.
         */

        public static char separador=':';
        private int id;
        private String texto;
        private String autor;

        /**
         * @exception IllegalArgumentException si el ID es menor a "0"
         * @param id : dato numerico id
         * @param autor : String nombre autor
         * @param texto : String texto
         */
        public EntradaBlogDJC(int id,String autor,String texto)throws IllegalArgumentException{
            if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
            this.id=id;
            this.autor=autor;
            this.texto=texto;
        }
        @Override
        public String toString(){
            String cad="";
            cad+="\nENTRADA DE"+separador+autor;
            cad+="\n "+texto;
            return cad;
        }

        /**
         * @return Metodo que devuelve la id
         */
        public int getId(){
            return this.id;
        }

        /**
         * @return Metodo que devuelve texto
         */
        public String getTexto(){
            return this.texto;
        }

        /**
         * @return Metodo que devuelve el autor en mayuscula
         */
        public String getAutor(){
            return this.autor.toUpperCase();
        }

        /**
         *Ver mejor metodo getAutor
         */
        public String devuelveAutor(){
            return this.autor;
        }

        /**
         *
         * @param args no son necesarios
         */
        public static void main(String[] args) {
            EntradaBlogDJC e1=new EntradaBlogDJC (3,"ana","Últimas noticias, está disponible BixBy 2.0");
            System.out.println(e1);
        }
    }

