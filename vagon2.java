public class vagon2 extends vagon {
	public void IzmenitxChisloMest(int NovoeChisloMest){
		ChisloMest = NovoeChisloMest;
	}
	
	public void ZanyatxMesto(int NomerMesta){
		if (MestoZanyato(NomerMesta) == 1) System.out.println("Это место уже занято: "+NomerMesta+" (вагон №"+NomerEtogoVagona+")!");
		super.ZanyatxMesto(NomerMesta);
	}
	
	public void VagonInfo() {
		System.out.println("Вагон №"+NomerEtogoVagona);
		int SvobodnoMest = 0;
		for (int i=0;i<ChisloMest;i++)
			if (MestoZanyato(i+1)==0) SvobodnoMest++;
		System.out.println("Число свободных мест: "+SvobodnoMest);
		System.out.println("Nнформация о свободных местах: ");
		for (int i=0;i<ChisloMest;i++)
			if (MestoZanyato(i+1)==0) System.out.print((i+1)+" ");
		System.out.println("");
	}
}
