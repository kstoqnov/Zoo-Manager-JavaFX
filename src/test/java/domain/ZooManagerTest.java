package domain;

import input.AnimalFileLoader;
import marketing.AnimalMarketing;
import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.Assertions;


import org.junit.Test;
import org.mockito.Mockito;

import javax.swing.text.html.ListView;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.mock;

/**
 * Created by Norbert on 2017-09-30.
 */
public class ZooManagerTest {


    @Test
    public void shouldReturnTrueWhenWeAddOneAnimalToEmptyMarketingList() {
        //given
        ZooManager zooManager = new ZooManager();
        Animal mockAnimal = mock(Animal.class);
        //when
        zooManager.addAnimal(mockAnimal.getName(),mockAnimal.getType(),mockAnimal.getAge());
        //then
        assertThat(zooManager.getAnimalMarketingList()).hasSize(1);


    }

    @Test
    public void shouldAddTypeOfAnimalToSetOfTypesWhenThereAreTheSameTypesAdded() {


    }

    @Test
    public void shouldThrowExceptionWhenAnimalIsNull() {


    }
}