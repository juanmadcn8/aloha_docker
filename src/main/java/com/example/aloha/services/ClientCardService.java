package com.example.aloha.services;

import java.util.List;
import java.util.Optional;

import com.example.aloha.models.ClientCard;

public interface ClientCardService {

    public List<ClientCard> getAllClientCards();

    public Optional<ClientCard> getClientCardById(Long id);

    public List<ClientCard> getClientCardByIdClient(Long idClient);

    public void createClientCard(ClientCard clientCard);

    public void updateClientCard(ClientCard clientCard);

    public void deleteClientCard(Long id);

    public void deleteClientCardByIdCard(Long idCard);

    public void deleteClientCardByIdClient(Long idClient);
}
