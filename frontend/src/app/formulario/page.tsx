import React from 'react'

export default function formulario() {
  return (
    <div className="max-w-3xl mx-auto bg-white p-8 rounded-2xl shadow-lg space-y-6 border">
    <div className="flex justify-between items-center border-b pb-4">
      <div className="text-left">
        <h1 className="text-sm font-bold uppercase">Hospital Universitário</h1>
        <p className="text-xs">Hospital Universitário</p>
      </div>
      <div className="text-center text-xs">
        <h1 className="text-sm font-bold">Universidade Federal do Piauí</h1>
      </div>
      <div className="text-right text-xs">
        <h1 className="text-sm font-bold">EBSERH</h1>
        <p>Hospitais Universitários</p>
        <p>Empresa Brasileira de Serviços Hospitalares</p>
      </div>
    </div>
  
    <h2 className="text-center text-lg font-bold uppercase">Ficha Clínica - Fototerapia</h2>
  
    <div className="grid grid-cols-1 sm:grid-cols-2 gap-4 text-sm">
      <div>
        <label className="font-medium">Nome:</label>
        <input type="text" className="w-full mt-1 border rounded px-2 py-1" />
      </div>
      <div>
        <label className="font-medium">Prontuário:</label>
        <input type="text" className="w-full mt-1 border rounded px-2 py-1" />
      </div>
      <div className="flex items-center gap-4">
        <label className="font-medium">Sexo:</label>
        <label className="inline-flex items-center">
          <input type="checkbox" className="rounded border-gray-300" />
          <span className="ml-1">Feminino</span>
        </label>
        <label className="inline-flex items-center">
          <input type="checkbox" className="rounded border-gray-300" />
          <span className="ml-1">Masculino</span>
        </label>
      </div>
      <div className="flex gap-4">
  
        <div className="w-1/2">
          <label className="font-medium">Data de nascimento:</label>
          <input type="date" className="w-full mt-1 border rounded px-2 py-1" />
        </div>
      </div>
      <div>
        <label className="font-medium">Telefone do médico:</label>
        <input type="tel" className="w-full mt-1 border rounded px-2 py-1" />
      </div>
      <div>
        <label className="font-medium">Médico que indicou:</label>
        <input type="text" className="w-full mt-1 border rounded px-2 py-1" />
      </div>
      <div>
        <label className="font-medium">Telefone do paciente:</label>
        <input type="tel" className="w-full mt-1 border rounded px-2 py-1" />
      </div>
        <div>
      <label htmlFor="fototipo" className="block text-sm font-medium text-gray-700">Fototipo</label>
      <select id="fototipo" name="fototipo" className="mt-1 w-full rounded-md border-gray-300 shadow-sm focus:ring-blue-500 focus:border-blue-500">
        <option value="">Selecione...</option>
        <option value="1">Pele branca</option>
        <option value="2">Pele morena clara</option>
        <option value="3">Pele morena moderada</option>
        <option value="4">Pele morena escura</option>
        <option value="5">Pele negra</option>
      </select>
    </div>
    </div>
  </div>
  );
}
