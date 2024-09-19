package ar.edu.utn.frba.dds.ejercicio_02.converters;

import ar.edu.utn.frba.dds.ejercicio_02.elementos.Arco;
import ar.edu.utn.frba.dds.ejercicio_02.elementos.ElementoDefensor;
import ar.edu.utn.frba.dds.ejercicio_02.elementos.Escudo;
import ar.edu.utn.frba.dds.ejercicio_02.elementos.Espada;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class ElementoDefensorAttributeConverter implements AttributeConverter<ElementoDefensor, String>{
    @Override
    public String convertToDatabaseColumn(ElementoDefensor elementoDefensor){
        if(elementoDefensor == null){
            return null;
        }
        String descripcionElementoDefensor="";

        if(elementoDefensor instanceof Escudo){
            descripcionElementoDefensor="Escudo";
        }
        else if (elementoDefensor instanceof Arco){
            descripcionElementoDefensor="Arco";
        }
        else if ((elementoDefensor instanceof Espada)){
            descripcionElementoDefensor="Espada";
        }
        return descripcionElementoDefensor;
    }


    // Convertir de java.sql.Date a LocalDate (para la entidad)
    @Override
    public ElementoDefensor convertToEntityAttribute(String dbData){
        if(dbData==null){
            return null;
        }
        ElementoDefensor elementoDefensor=null;
        switch (dbData){
            case "Escudo":elementoDefensor=new Escudo(); break;
            case "Arco":elementoDefensor=new Arco();break;
            case "Espada": elementoDefensor=new Espada();break;
        }
        return elementoDefensor;
    }

}
