package br.com.estudo.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.estudo.entity.Noticia;

@Path("/noticias")
public class NoticiaService {
    
    @GET
    @Produces(value = MediaType.APPLICATION_XML)//MediaType.APPLICATION_JSON
    @Path("/todas")
    public List<Noticia> buscarTodos(){
        
        List<Noticia> noticias = new ArrayList<Noticia>();
        
        noticias.add(new  Noticia("Bandido foi Preso", "bandido foi preso hoje"));
        noticias.add(new  Noticia("Preco do feijao cai", "Preço do feijao esta 1,99"));
        noticias.add(new  Noticia("Desemprego acaba", "taxa de desemprego cai no brasil"));
        noticias.add(new  Noticia("Urna Eletronicas", "Urnas eletronicas sao destruidas"));
        noticias.add(new  Noticia("Sbt x Globo", "Sbt e melhor que a globo"));
        noticias.add(new  Noticia("Refugiados", "cada vez mais refugiados aparecem"));
        noticias.add(new  Noticia("Vizinho", "quanse todos os vizinhos são chatos"));
        noticias.add(new  Noticia("Condominio", "Taxa de condominios caiem"));
        
        return noticias;
    }
    
    //@path : indicao caminho para acessar o metodo ../noticias/todas ( essa lista poderia estar vindo do banco de dados)
    //@Produces : define o tipo de arquivo q sera retorndo Json, xml e outros....
}
