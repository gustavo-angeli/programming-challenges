function areYouPlayingBanjo1(name) {
    if (name.toLowerCase().startsWith("r")) {
        return name + " plays banjo"
    }
    return name + " does not play banjo";
}

function areYouPlayingBanjo2(name) {
    return name + (name[0].toLowerCase() == 'r' ? ' plays' : ' does not play') + " banjo";
}