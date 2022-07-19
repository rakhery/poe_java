package org.chris.exosolid.cas2;

/**
 *
 * Proposition de Solution: Séparer en imposant un contrat dans des interfaces
 * expemple: Interface IGestionPost, IGestionMedia, IGestionChat
 * permet de countourner l'héritage multiple et respecter le principe de Liskov
 */


abstract class SocialMedia {

    //@support WhatsApp,Facebook,Instagram
    public abstract void chatWithFriend();

    //@support Facebook,Instagram
    public abstract void publishPost(Object post);

    //@support WhatsApp,Facebook,Instagram
    public abstract void sendPhotosAndVideos();
    //Problème de la classe Instangram n'a pas de methode groupVideoCall
    //@support WhatsApp,Facebook
    public abstract void groupVideoCall(String... users);
}
